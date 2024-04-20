package com.example.jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.jpa_demo.dao.AlienRepo;

@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/aliens")
    @ResponseBody
    public String getlAiens() {
        return repo.findAll().toString();
    }

    @RequestMapping("/aliens/{id}")
    @ResponseBody
    public String getAlien(@PathVariable("id") int id) {
        return repo.findById(id).toString();
    }
}
