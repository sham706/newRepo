package com.shamanth.Movie_services.Model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String director;

    @ElementCollection
    private List<String> actors = new ArrayList<>();

    public Movie() {
    	
    }
	public Movie(int id, String name, String director, List<String> actors) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.actors = actors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

    
}
