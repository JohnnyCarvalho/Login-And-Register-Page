package com.JohnnyCarvalho.loginandregisterpage.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JohnnyCarvalho.loginandregisterpage.dto.UserData_DTO;
import com.JohnnyCarvalho.loginandregisterpage.models.UserDataModel;
import com.JohnnyCarvalho.loginandregisterpage.services.UserDataService;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class UserDataController {
	
	final UserDataService userDataService;

	public UserDataController(UserDataService userDataService) {
		this.userDataService = userDataService;
	}
	
	@PostMapping
	public ResponseEntity<Object> saveUserData(@RequestBody @Valid UserData_DTO userDataDto) {
		var userDataModel = new UserDataModel();
		BeanUtils.copyProperties(userDataDto, userDataModel);// Converte DTO em Model
		return ResponseEntity.status(HttpStatus.CREATED).body(userDataService.save(userDataModel));
	}
	
	

}
