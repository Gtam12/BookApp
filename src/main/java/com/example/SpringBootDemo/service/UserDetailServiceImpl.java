package com.example.SpringBootDemo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringBootDemo.repository.*;
import com.example.SpringBootDemo.entity.*;
import com.example.SpringBootDemo.security.*;

public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepositroy;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user =userRepositroy.getUserByUsername(username);
		
		if(user == null) {
			throw  new UsernameNotFoundException("could not find user");
		}
		
		
		return new MyUserDetails(user);
	}

}
