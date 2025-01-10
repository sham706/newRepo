package com.shamanth.Movie_services.Dao;

import com.shamanth.Movie_services.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
