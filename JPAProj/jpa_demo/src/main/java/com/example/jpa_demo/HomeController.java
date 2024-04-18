package com.example.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jpa_demo.dao.AlienRepo;
import com.example.jpa_demo.model.Alien;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        repo.save(alien);
        return "addAlien.jsp";
    }
}
