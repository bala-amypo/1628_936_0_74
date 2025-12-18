package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class ValidationEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private String password;
    private Integer username;
}