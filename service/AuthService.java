package com.example.msa.service;

import com.example.msa.entity.*;

public interface AuthService {

	UserEntity register(UserEntity userEntity);
	
	String login(String usernameOrEmail, String password);
}