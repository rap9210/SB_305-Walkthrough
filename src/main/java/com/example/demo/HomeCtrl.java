package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeCtrl {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/")
    public String index(Model model){
        Set<Movie> movies = new HashSet<>();
        Set<Actor> actors = new HashSet<>();

        Actor actor = new Actor();
        actor.setStageName("Big Bird");
        actor.setRealName("Birdie");

        actors.add(actor);

        Movie movie = new Movie();
        movie.setTitle("Sesame Street");
        movie.setDescription("Children TV Show");
        movie.setYear(1985);
        movie.setCast(actors);

        movies.add(movie);

        Movie movie2 = new Movie();
        movie2.setTitle("Big Bird Movie");
        movie2.setDescription("Children TV Show");
        movie2.setYear(1987);
        movie2.setCast(actors);

        movies.add(movie2);

        actor.setMovies(movies);
        actorRepository.save(actor);
        movieRepository.save(movie);
        movieRepository.save(movie2);







        model.addAttribute("actors", actorRepository.findAll());
        return "index";

    }
}
