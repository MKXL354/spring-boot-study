package com.example.my_web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("home")
    public ModelAndView home(Alien alien) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("alien", alien);
        mv.setViewName("home");
        return mv;
        // req for: http://localhost:8080/home?id=123&name=Mahdy&lang=Java
    }
}
