package com.example.jpa_demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.jpa_demo.dao.AlienRepo;
import com.example.jpa_demo.model.Alien;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @RequestMapping(path = "/aliens", produces = "application/xml")
    @ResponseBody
    public List<Alien> getlAiens() {
        return repo.findAll();
    }

    @RequestMapping(path = "/alien/{id}", produces = "application/xml")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("id") int id) {
        return repo.findById(id);
    }
}
