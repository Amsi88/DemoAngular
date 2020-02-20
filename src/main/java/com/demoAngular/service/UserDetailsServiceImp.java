package com.demoAngular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demoAngular.entity.Users;

public class UserDetailsServiceImp implements UserDetailsService {

	@Autowired
	UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = findUserbyUername(username);

		UserBuilder builder = null;
		if (user != null) {
			builder = org.springframework.security.core.userdetails.User.withUsername(username);
			builder.password(new BCryptPasswordEncoder().encode(user.getUsPassword()));
			builder.roles("ADMIN");//Add roles if is necessary
		} else {
			throw new UsernameNotFoundException("User not found.");
		}

		return builder.build();
	}

	private Users findUserbyUername(String usLogin) {
		return userService.findByUsLogin(usLogin);
	}
}
