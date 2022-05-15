package com.dev.demoDSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.demoDSmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie, Long> {

}
