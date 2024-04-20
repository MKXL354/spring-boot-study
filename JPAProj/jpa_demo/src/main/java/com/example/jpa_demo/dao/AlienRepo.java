package com.example.jpa_demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.jpa_demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
