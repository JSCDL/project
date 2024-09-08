package com.example.mybackend.demo.service.impl;

import com.example.mybackend.demo.Repo.ArticleRepository;
import com.example.mybackend.demo.entity.Data.Article;
import com.example.mybackend.demo.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleRepository articleRepository;

    @Override
    public void creatArticle(String title, String content) {
        Article article=new Article();
        article.setTitle(title);
        article.setContent(content);
        articleRepository.save(article);
    }
}
