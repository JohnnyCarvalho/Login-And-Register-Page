package com.JohnnyCarvalho.loginandregisterpage.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.JohnnyCarvalho.loginandregisterpage.models.UserDataModel;
import com.JohnnyCarvalho.loginandregisterpage.repositories.UserDataRepository;

@Service
public class UserDataService {
	
	
	final UserDataRepository userDataRepository;

	public UserDataService(UserDataRepository userDataRepository) {
		this.userDataRepository = userDataRepository;
	}

	@Transactional
	public UserDataModel save(UserDataModel userDataModel) {
		
		return userDataRepository.save(userDataModel);
	}

}
