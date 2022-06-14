package com.sblog.simpleblog.controller;

import com.github.pagehelper.PageInfo;
import com.sblog.simpleblog.entity.Article;
import com.sblog.simpleblog.entity.Comment;
import com.sblog.simpleblog.entity.User;
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
    public ModelAndView articleDetailsView(@PathVariable int id,
                                           @RequestParam(defaultValue = "1", required = false) int startPage,
                                           @RequestParam(defaultValue = "12", required = false) int pageSize) {
        ModelAndView modelAndView = new ModelAndView("/article/detail");
        Article article = articleService.findById(id);
        PageInfo<Comment> commentPageInfo = commentService.findByArticle(article, startPage, pageSize);
        modelAndView.addObject("article", article);
        modelAndView.addObject("commentPageInfo", commentPageInfo);
        return modelAndView;
    }

    @GetMapping("list")
    public ModelAndView userArticleList(@RequestParam(defaultValue = "1", required = false) int startPage,
                                        @RequestParam(defaultValue = "12", required = false) int pageSize,
                                        @Autowired HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("/article/list");
        User user = (User) session.getAttribute("user");
        PageInfo<Article> articlePageInfo = articleService.findByUser(user, startPage, pageSize);
        modelAndView.addObject("articlePageInfo", articlePageInfo);
        return modelAndView;
    }

    @GetMapping("delete")
    public ModelAndView deleteArticleAction(@RequestParam(name = "id") int id,
                                            @Autowired HttpSession session) {
        User user = (User) session.getAttribute("user");
        Article article = articleService.findById(id);
        if (article.getPublisher().getId().equals(user.getId())) {
            articleService.remove(article);
        }
        return new ModelAndView("redirect:/article/list");
    }

    @GetMapping("update")
    public ModelAndView updateArticleView(@RequestParam(name = "id") int id,
                                          @Autowired HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("/article/update");
        User user = (User) session.getAttribute("user");
        Article article = articleService.findById(id);
        if (!article.getPublisher().getId().equals(user.getId())) {
            modelAndView.setViewName("redirect:/article/list");
        }
        modelAndView.addObject("article", article);
        return modelAndView;
    }

    @PostMapping("update")
    public ModelAndView updateArticleAction(Article article, @Autowired HttpSession session) {
        User user = (User) session.getAttribute("user");
        article.setPublisher(user);
        return new ModelAndView("redirect:/article/list");
    }

    @GetMapping("add")
    public ModelAndView addArticleView() {
        return new ModelAndView("/article/add");
    }

    @PostMapping("add")
    public ModelAndView addArticleAction(Article article, HttpSession session) {
        User user = (User) session.getAttribute("user");
        article.setPublisher(user);
        articleService.add(article);
        return new ModelAndView("redirect:/article/list");
    }
}
