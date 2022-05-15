package com.dev.demoDSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.demoDSmovie.entities.Score;
import com.dev.demoDSmovie.entities.ScorePK;

public interface ScoreRepository3 extends JpaRepository <Score, ScorePK> {

}
