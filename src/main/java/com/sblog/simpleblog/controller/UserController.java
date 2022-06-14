package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.ArticleService;
import com.sblog.simpleblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
@RequestMapping("user")
public class UserController {
    private UserService userService;
    private ArticleService articleService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("login")
    public ModelAndView loginView() {
        var modelAndView = new ModelAndView("/user/login");
        return modelAndView;
    }

    @PostMapping("login")
    public ModelAndView loginAction(@RequestParam("username") String username, @RequestParam("password") String password) {
        var modelAndView = new ModelAndView("/user/login");
        return modelAndView;
    }

    @GetMapping("register")
    public ModelAndView registerView() {
        var modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @PostMapping("register")
    public ModelAndView registerAction(@Validated User user) {
        var modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @GetMapping("/{userId}")
    public ModelAndView userMainPage(@PathVariable("userId") int userId,
                                     @RequestParam(required = false, name = "startPage", defaultValue = "1") int startPage,
                                     @RequestParam(required = false, name = "pageSize", defaultValue = "10") int pageSize) {
        var modelAndView = new ModelAndView("index");
        modelAndView.addObject("articles", articleService.findArticleByUser(userService.findUserById(userId), startPage,pageSize));
        return modelAndView;
    }
}
