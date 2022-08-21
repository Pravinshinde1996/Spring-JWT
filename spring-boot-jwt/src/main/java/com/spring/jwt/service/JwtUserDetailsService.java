package com.spring.jwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	public final static String USERNAME="pravin";
	public final static String PASSWORD="pravin";
	//normal password(password) convert into bcryptpassord($2a$10$Lywyc0DwajnCYPRcMgVkmec3dxmfdaQmLgEH19h07t2XOYzn40CYa)
	public final static String BCRYPTHASHPASSWORD="$2a$10$Lywyc0DwajnCYPRcMgVkmec3dxmfdaQmLgEH19h07t2XOYzn40CYa";

	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if(USERNAME.equals(username)) {
			return new User(USERNAME, BCRYPTHASHPASSWORD, new ArrayList<>());
		}else {
			throw new UsernameNotFoundException(username+"This user is not found");
		}
	}
	
}
