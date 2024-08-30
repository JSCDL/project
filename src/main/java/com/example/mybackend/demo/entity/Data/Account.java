package com.example.mybackend.demo.entity.Data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Account")
public class Account {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//规则
    int id;

    @Column(name = "name")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "Role")
    String role;
}
