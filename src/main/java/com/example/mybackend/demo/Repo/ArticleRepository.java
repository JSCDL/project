package com.example.mybackend.demo.Repo;

import com.example.mybackend.demo.entity.Data.Account;
import com.example.mybackend.demo.entity.Data.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository  extends JpaRepository<Article,Integer> /*<实体类,主键类型>*/{


}
