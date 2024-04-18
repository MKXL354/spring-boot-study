package com.example.jpa_demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.jpa_demo.model.Alien;

@Component
public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
