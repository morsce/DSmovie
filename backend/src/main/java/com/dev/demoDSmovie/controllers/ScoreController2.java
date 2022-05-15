package com.dev.demoDSmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.demoDSmovie.dto.MovieDto;
import com.dev.demoDSmovie.dto.ScoreDto;
import com.dev.demoDSmovie.services.ScoreService2;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController2 {
	
	@Autowired
	private ScoreService2 service;
	
	
    @PutMapping
   	public MovieDto saveScore(@RequestBody ScoreDto dto) {
   		MovieDto movieDTO = service.saveScore(dto);
   		return movieDTO;
   	}
}
