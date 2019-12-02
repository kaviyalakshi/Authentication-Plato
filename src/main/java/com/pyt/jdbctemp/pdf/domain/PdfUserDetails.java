package com.pyt.jdbctemp.pdf.domain;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.pyt.jdbctemp.model.User;

import java.util.Collection;
import java.util.stream.Collectors;
public class PdfUserDetails implements UserDetails {
    private User user;
    public PdfUserDetails(User user) {
        this.user = user;
    }
    public int getId() {
        return user.getUser_id();
    }
    @Override
    public String getPassword() {
        return user.getPassword();
    }
    @Override
    public String getUsername() {
        return user.getUsername();
    }
    public User getUserDetails() {
        return user;
    }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
}