package br.com.crudthymeleaf.controller;

import br.com.crudthymeleaf.model.Movie;
import br.com.crudthymeleaf.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute(new Movie());
        return "index";
    }


    @PostMapping("/movie")
    public String saveMovie(@ModelAttribute Movie movie){
        service.saveMovie(movie);
        return "redirect:movie";
    }

    @GetMapping("/movie")
    public String listMovies(Model model){
        model.addAttribute("movies", service.findAllMovies());
        return "list-movies";
    }
}
