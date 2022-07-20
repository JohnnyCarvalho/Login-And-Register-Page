package com.JohnnyCarvalho.loginandregisterpage.services;

import org.springframework.stereotype.Service;

import com.JohnnyCarvalho.loginandregisterpage.repositories.UserDataRepository;

@Service
public class UserDataService {
	
	
	final UserDataRepository userDataRepository;

	public UserDataService(UserDataRepository userDataRepository) {
		this.userDataRepository = userDataRepository;
	}

}
