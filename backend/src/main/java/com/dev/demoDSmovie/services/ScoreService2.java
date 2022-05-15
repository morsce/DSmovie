package com.dev.demoDSmovie.services;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.demoDSmovie.dto.MovieDto;
import com.dev.demoDSmovie.dto.ScoreDto;
import com.dev.demoDSmovie.entities.Movie;
import com.dev.demoDSmovie.entities.Score;
import com.dev.demoDSmovie.entities.User;
import com.dev.demoDSmovie.repositories.MovieRepository;
import com.dev.demoDSmovie.repositories.ScoreRepository3;
import com.dev.demoDSmovie.repositories.UserRepository2;



@Service
public class ScoreService2 {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository2 userRepository;
	
	@Autowired
	private ScoreRepository3 scoreRepository;
	
	@Transactional
	public MovieDto saveScore(ScoreDto dto) {
	
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
        for  (Score s : movie.getScores()) {
        	sum = sum + s.getValue();
        }
        
        double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDto(movie);
	  }

	}
	

