package com.example.mybackend.demo.controller;


import com.example.mybackend.demo.entity.Resp.RestBean;
import com.example.mybackend.demo.service.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/auth")
public class AuthApiController {
    @Resource
    ArticleService articleService;

    @PostMapping("/AddArticle")
    RestBean<Void> AddArticle(@RequestParam("title") String title, @RequestParam("content") String content){
        articleService.creatArticle(title,content);
        return new RestBean<>(200,"");
    }

}
