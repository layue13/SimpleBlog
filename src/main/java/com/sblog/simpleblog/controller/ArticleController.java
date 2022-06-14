package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.service.ArticleService;
import com.sblog.simpleblog.service.CommentService;
import com.sblog.simpleblog.service.UserService;
import net.sf.jsqlparser.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("article")
public class ArticleController {
    private CommentService commentService;
    private ArticleService articleService;
    private UserService userService;

    @GetMapping("/{id}")
    public ModelAndView articleDetailsView(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("article/detail");
        return modelAndView;
    }

    @GetMapping("list")
    public ModelAndView userArticleList(@RequestParam(name="user_id") int userId) {
        ModelAndView modelAndView = new ModelAndView("/article/list");
        return modelAndView;
    }

    @GetMapping("delete")
    public ModelAndView deleteArticleAction(@RequestParam(name = "id") int id, HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/delete");
        return modelAndView;
    }

    @GetMapping("update")
    public ModelAndView updateArticleView(@RequestParam(name = "id") int id, HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/update");
        return modelAndView;
    }

    @PostMapping("update")
    public ModelAndView updateArticleAction(Article article, HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/update");
        return modelAndView;
    }
}
