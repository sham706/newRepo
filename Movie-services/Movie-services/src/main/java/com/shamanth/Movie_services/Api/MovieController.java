package com.shamanth.Movie_services.Api;

import com.shamanth.Movie_services.Model.Movie;
import com.shamanth.Movie_services.Service.MovieService;
import jdk.jfr.Description;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;
//    @RequestMapping("/movies/{me}")
//    public String test(@PathVariable String me) {
//		return "bye";
//    }
//    create
    @PostMapping
    public Movie create(@RequestBody Movie movie){

        return movieService.create(movie);
    }

//    Read
    @GetMapping("/{id}")
    public Movie read(@PathVariable int id){
        return movieService.read(id);
    }

//    update
    @PutMapping("/{id}")
    public void update(@RequestBody Movie movie, @PathVariable int id){
        movieService.update(id, movie);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable int id)
    {
        movieService.delete(id);
    }

}
