package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.service.ArticleService;
import com.sblog.simpleblog.service.CommentService;
import com.sblog.simpleblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("article")
@SessionAttributes("user")
public class ArticleController {
    private CommentService commentService;
    private ArticleService articleService;
    private UserService userService;

    @Autowired
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ModelAndView articleDetailsView(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/article/detail");
        return modelAndView;
    }

    @GetMapping("list")
    public ModelAndView userArticleList(@RequestParam(name="user_id") int userId) {
        ModelAndView modelAndView = new ModelAndView("/article/list");
        return modelAndView;
    }

    @GetMapping("delete")
    public ModelAndView deleteArticleAction(@RequestParam(name = "id") int id, @Autowired HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/delete");
        return modelAndView;
    }

    @GetMapping("update")
    public ModelAndView updateArticleView(@RequestParam(name = "id") int id,@Autowired HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/update");
        return modelAndView;
    }

    @PostMapping("update")
    public ModelAndView updateArticleAction(Article article, @Autowired HttpSession session){
        ModelAndView modelAndView= new ModelAndView("/article/update");
        return modelAndView;
    }
}
