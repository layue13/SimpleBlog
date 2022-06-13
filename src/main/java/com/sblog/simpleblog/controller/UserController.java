package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.ArticleService;
import com.sblog.simpleblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView loginView(){
        var modelAndView = new ModelAndView("/user/login");
        return modelAndView;
    }

    @RequestMapping("login")
    public ModelAndView loginAction(@RequestParam("username") String username, @RequestParam("password") String password){
        var modelAndView = new ModelAndView("/user/login");
        return modelAndView;
    }

    @GetMapping("register")
    public ModelAndView registerView(){
        var modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @GetMapping("register")
    public ModelAndView registerAction(@Validated User user){
        var modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @GetMapping("/{user" +
            "Id}")
    public ModelAndView userMainPage(@PathVariable String userId){
        var modelAndView = new ModelAndView("/user/main_page");
        return modelAndView;
    }
}
