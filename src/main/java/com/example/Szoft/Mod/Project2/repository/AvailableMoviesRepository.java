package com.example.Szoft.Mod.Project2.repository;

import com.example.Szoft.Mod.Project2.entity.AvailableMovies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvailableMoviesRepository extends CrudRepository<AvailableMovies, Integer> {


}