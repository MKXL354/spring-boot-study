package com.example.jpa_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jpa_demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
