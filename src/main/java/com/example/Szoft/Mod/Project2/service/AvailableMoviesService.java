package com.example.Szoft.Mod.Project2.service;

import com.example.Szoft.Mod.Project2.entity.AvailableMovies;
import com.example.Szoft.Mod.Project2.repository.AvailableMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvailableMoviesService {

    @Autowired
    private AvailableMoviesRepository availableMoviesRepository;


    public void insertAvailableMovies(AvailableMovies availableMovies) {
        this.availableMoviesRepository.save(availableMovies);
    }


    public Iterable<AvailableMovies> getAllAvailableMovies() {
        return availableMoviesRepository.findAll();
    }

    public Optional<AvailableMovies> getAvailableMoviesById(Integer id){
        return this.availableMoviesRepository.findById(id);
    }

    public void updateAvailableMovies(AvailableMovies availableMovies) {
        this.availableMoviesRepository.save(availableMovies);
    }

    public String removeAvailableMoviesById(Integer id) {
        try {
            this.availableMoviesRepository.deleteById(id);
            return "Sikeres törlés!";
        }
        catch(EmptyResultDataAccessException e) {
            return "Nem létezik ilyen id!";
        }
    }
}
