package com.example.my_web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home() {
        System.out.println("home accessed");
        return "home";
    }

    @RequestMapping("test")
    public void test() {
        System.out.println("test accessed");
    }
}
