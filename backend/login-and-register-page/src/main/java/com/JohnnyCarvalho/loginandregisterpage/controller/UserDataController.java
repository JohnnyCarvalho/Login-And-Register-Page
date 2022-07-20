package com.JohnnyCarvalho.loginandregisterpage.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JohnnyCarvalho.loginandregisterpage.services.UserDataService;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class UserDataController {
	
	final UserDataService userDataService;

	public UserDataController(UserDataService userDataService) {
		this.userDataService = userDataService;
	}
	
	

}
