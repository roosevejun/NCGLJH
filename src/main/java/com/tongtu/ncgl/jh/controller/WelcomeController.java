package com.tongtu.ncgl.jh.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(method = RequestMethod.GET, value = "/welcome.do")
    public ModelAndView mainIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main/main");
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/top.do")
    public ModelAndView top() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main/top");
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/left.do")
    public ModelAndView left() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main/left");
        return mav;
    }
}
