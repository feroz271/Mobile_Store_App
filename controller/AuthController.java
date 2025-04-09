package com.example.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.msa.entity.UserEntity;
import com.example.msa.model.LoginDTO;
import com.example.msa.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> doRegistration(@RequestBody UserEntity userEntity) {
        UserEntity registeredUser = authService.register(userEntity);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> doLogin(@RequestBody LoginDTO loginDTO) {
        String token = authService.login(loginDTO.getUsernameOrEmail(), loginDTO.getPassword());
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
