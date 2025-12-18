package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.Validation.constraints.NotNull;
import jakarta.Validation.constraints.Size;
@Entity
public class ValidationEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=8,meaasge="must be 2 to 8 character")
    private String username;
    private String email;
    private String password;
    private Integer username;
}