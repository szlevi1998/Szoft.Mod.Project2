package com.example.Szoft.Mod.Project2.controller;

import com.example.Szoft.Mod.Project2.entity.AvailableMovies;
import com.example.Szoft.Mod.Project2.service.AvailableMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ava_movies")
public class AvailableMoviesController {

    @Autowired
    private AvailableMoviesService availableMoviesService;


    @RequestMapping(method = RequestMethod.GET)
    public Iterable<AvailableMovies> getAllAvailableMovies() {
        return availableMoviesService.getAllAvailableMovies();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<AvailableMovies> getAvailableMoviesById(@PathVariable("id") int id){
        return availableMoviesService.getAvailableMoviesById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteAvailableMoviesById(@PathVariable("id") int id) {
        return availableMoviesService.removeAvailableMoviesById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateAvailableMovies(@RequestBody AvailableMovies availableMovies) {
        availableMoviesService.updateAvailableMovies(availableMovies);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertAvailableMovies(@RequestBody AvailableMovies availableMovies){
        return availableMoviesService.insertAvailableMovies(availableMovies);
    }
}
