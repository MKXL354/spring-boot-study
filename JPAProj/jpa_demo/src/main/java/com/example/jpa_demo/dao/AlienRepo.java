package com.example.jpa_demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.jpa_demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    @Query("from Alien order by name")
    List<Alien> sortByName();
}
