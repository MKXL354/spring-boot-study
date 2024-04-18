package com.example.my_web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        session.setAttribute("name", name);
        System.out.println(name);
        return "home";
    }
}
