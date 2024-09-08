package com.example.mybackend.demo.entity.Data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Article")
public class Article {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//规则
    int id;

    @Column(name = "title")
    String title;

    @Column(name = "content")
    String content;

}
