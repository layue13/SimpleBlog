package com.sblog.simpleblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("article")
public class ArticleController {


    @GetMapping("/{id}")
    public ModelAndView articleDetailsView(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("article/detail");
        return modelAndView;
    }
}
