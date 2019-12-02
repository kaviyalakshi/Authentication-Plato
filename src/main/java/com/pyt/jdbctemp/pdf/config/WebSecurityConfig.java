package com.pyt.jdbctemp.pdf.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pyt.jdbctemp.service.impl.UserDetailsServiceImpl;
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public UserDetailsService userDetailsService1() {
        return new UserDetailsServiceImpl();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().antMatchers("/wallPage").hasAnyRole("ADMIN", "USER")
                .and()
                .authorizeRequests().antMatchers("/userlogin", "/resource/**").permitAll()
                .and()
          .formLogin().loginPage("/userlogin").usernameParameter("username").passwordParameter("password").permitAll()
                .loginProcessingUrl("/doLogin")
                .successForwardUrl("/postLogin")
                .failureUrl("/loginFailed")
                .and()
                .authorizeRequests().antMatchers("/glogin").permitAll()
                .and().oauth2Login()
                .and()
                .logout().logoutUrl("/doLogout").logoutSuccessUrl("/logout").permitAll()
                .and()
                .csrf().disable();
    }
}