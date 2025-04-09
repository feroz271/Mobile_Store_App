package com.example.msa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.msa.entity.*;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

	Optional<UserEntity> findByUsernameOrEmail(String username,String email);
}