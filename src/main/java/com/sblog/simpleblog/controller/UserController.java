package com.sblog.simpleblog.controller;

import com.sblog.simpleblog.entity.User;
import com.sblog.simpleblog.service.ArticleService;
import com.sblog.simpleblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    public ModelAndView loginAction(@RequestParam("username") String username,
                                    @RequestParam("password") String password,
                                    @Autowired HttpSession session) {
        var modelAndView = new ModelAndView("/user/login");
        User user = userService.login(username, password);
        if (user != null) {
            modelAndView.setViewName("redirect:/user/dashboard");
            session.setAttribute("user", user);
        }
        return modelAndView;
    }

    @GetMapping("register")
    public ModelAndView registerView() {
        ModelAndView modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @PostMapping("register")
    public ModelAndView registerAction(@Validated User user) {
        var modelAndView = new ModelAndView("/user/register");
        return modelAndView;
    }

    @GetMapping("settings")
    public ModelAndView settingsView() {
        ModelAndView modelAndView = new ModelAndView("/user/settings");
        return modelAndView;
    }

    @PostMapping("settings")
    public ModelAndView settingsAction() {
        ModelAndView modelAndView = new ModelAndView("/user/settings");
        return modelAndView;
    }

    @GetMapping("/{userId}")
    public ModelAndView userDetails(@PathVariable("userId") int userId,
                                    @RequestParam(required = false, name = "startPage", defaultValue = "1") int startPage,
                                    @RequestParam(required = false, name = "pageSize", defaultValue = "10") int pageSize) {
        ModelAndView modelAndView = new ModelAndView("/user/details");
        User user = userService.findById(userId);
        modelAndView.addObject("user", user);
        modelAndView.addObject("articles", articleService.findByUser(user, startPage, pageSize));
        return modelAndView;
    }

    @GetMapping("dashboard")
    public ModelAndView dashboardView(@Autowired HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("/user/dashboard");
        modelAndView.addObject("user", session.getAttribute("user"));
        return modelAndView;
    }

    @GetMapping("logout")
    public ModelAndView logout(@Autowired HttpSession session){
        session.setAttribute("user",null);
        return new ModelAndView("redirect:/index");
    }
}
