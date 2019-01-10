package br.com.crudthymeleaf.service;

import br.com.crudthymeleaf.model.Movie;
import br.com.crudthymeleaf.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository repository;

    @Transactional
    public void saveMovie(Movie movie){
        repository.save(movie);
    }

    @Transactional
    public List<Movie> findAllMovies(){
        return (List<Movie>) repository.findAll();
    }

}
