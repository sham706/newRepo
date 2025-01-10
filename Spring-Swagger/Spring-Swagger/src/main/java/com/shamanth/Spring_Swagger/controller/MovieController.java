package com.shamanth.Spring_Swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shamanth.Spring_Swagger.model.Movie;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	List<Movie> movie = new ArrayList<>();
	@GetMapping
	public List<Movie> getMovie(){
		return movie;
	}
	
	@PostMapping
	public Movie postMovie(@RequestBody Movie movies){
		movie.add(movies);
		return movies;
	}

	
}
