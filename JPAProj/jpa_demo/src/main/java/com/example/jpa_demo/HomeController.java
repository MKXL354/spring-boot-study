package com.example.jpa_demo;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("getAlien")
    public ModelAndView getAlien(@RequestParam int id) {
        ModelAndView mv = new ModelAndView("getAlien.jsp");
        Alien alien = repo.findById(id).orElseThrow(() -> new NoSuchElementException("Alien not found"));
        mv.addObject("alien", alien);
        System.out.println(repo.sortByName());
        return mv;
    }
}
