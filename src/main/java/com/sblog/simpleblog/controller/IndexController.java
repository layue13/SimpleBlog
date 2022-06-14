package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    private ArticleService articleService;

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/index")
    public ModelAndView indexView(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("articleList");
        return modelAndView;
    }
}
