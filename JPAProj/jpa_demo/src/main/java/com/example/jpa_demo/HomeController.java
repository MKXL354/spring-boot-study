package com.example.jpa_demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa_demo.dao.AlienRepo;
import com.example.jpa_demo.model.Alien;

@RestController
public class HomeController {

    @Autowired
    AlienRepo repo;

    @GetMapping("/aliens")
    public List<Alien> getAliens() {
        return repo.findAll();
    }

    @GetMapping("/alien/{id}")
    public Optional<Alien> getAlien(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @PostMapping("/alien")
    public Alien postAlien(Alien alien) {
        repo.save(alien);
        return alien;
    }
}
