package com.pyt.jdbctemp.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.pyt.jdbctemp.model.User;
import com.pyt.jdbctemp.repository.UserRepository;

@Service
public class CustomAuthenticationProviderService implements AuthenticationProvider {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken authenticationToken = null;
		
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		User user = userRepository.getUserByUsername(username);
		if(user != null) {
			if(username.equals(user.getUsername()) && BCrypt.checkpw(password, user.getPassword())) {
				//Collection<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(user);
				authenticationToken = new UsernamePasswordAuthenticationToken(
						new org.springframework.security.core.userdetails.User(username, password, null), password);
			}
		} else {
			throw new UsernameNotFoundException("User name "+username+" not found");
		}
		return authenticationToken;
	}

//	private Collection<GrantedAuthority> getGrantedAuthorities(User user) {
//		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//		if(user.getRole().getName().equals("admin")) {
//			grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		}
//		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		return grantedAuthorities;
//	}
//	
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}