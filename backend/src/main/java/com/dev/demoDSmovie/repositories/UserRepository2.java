package com.dev.demoDSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.demoDSmovie.entities.User;

public interface UserRepository2 extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
