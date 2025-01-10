package com.shamanth.Movie_services.Service;

import com.shamanth.Movie_services.Dao.MovieRepository;
import com.shamanth.Movie_services.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

//    four things will be done here create, Read, update & Delete


    public Movie create(Movie movie){
        if(movie == null){
            throw new RuntimeException("no user is creted");
        }
        return movieRepository.save(movie);
    }

//    find byId
    public Movie read(int id){
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("this movies not there"));
    }

// update
    public void update(int id, Movie update){
        if(update == null || id ==0){
            throw new RuntimeException("no user is creted");
        }
        if(movieRepository.existsById(id)){
            Movie movie = movieRepository.getReferenceById(id);
//            movie.setName(update.getName());
//            movie.setDirector(update.getDirector());
//            movie.setActors(update.getActors());
            movieRepository.save(movie);

        }
    }

//  delete
    public void delete(int id){
        if(movieRepository.existsById(id)){
            movieRepository.deleteById(id);
        }else{
            throw new RuntimeException("No such movie exist");
        }


    }
}
