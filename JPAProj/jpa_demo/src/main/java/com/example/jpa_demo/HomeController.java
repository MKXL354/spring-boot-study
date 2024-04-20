package com.example.jpa_demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Alien postAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    // You can send form-data here

    @DeleteMapping("/alien/{id}")
    public String deleteAlien(@PathVariable("id") int id) {
        Alien a = repo.findById(id).orElse(new Alien());
        try {
            repo.delete(a);
            return id + " deleted";
        } catch (EmptyResultDataAccessException e) {
            return "not found";
        }
    }
    // REST delete has no body

    @PutMapping("/alien")
    public Alien putAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    // You should send raw data here
}
