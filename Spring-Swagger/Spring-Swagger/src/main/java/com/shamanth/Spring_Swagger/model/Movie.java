package com.shamanth.Spring_Swagger.model;

public class Movie {
	
	private String name;
	private String actor;
	
	public Movie() {
		
	}
	public Movie(String name, String actor) {
		super();
		this.name = name;
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	

}
