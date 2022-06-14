package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    private ArticleService articleService;

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping({"/index","/"})
    public ModelAndView indexView(@RequestParam(name="startPage",defaultValue = "1",required = false) int startPage,
                                  @RequestParam(name="pageSize",defaultValue = "12",required = false) int pageSize){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("articleList",articleService.findAll(startPage, pageSize));
        return modelAndView;
    }
}
