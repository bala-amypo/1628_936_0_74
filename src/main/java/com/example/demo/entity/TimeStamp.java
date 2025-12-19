package com.example.demo.entity;

public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Integer id;
      private String name;
      private String email;
      private String password;
      private Date createAt;