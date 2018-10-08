package com.tongtu.ncgl.jh.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public ModelAndView welcome(Map<String, Object> model) {
        return new ModelAndView("redirect:/home.do");
    }
}
