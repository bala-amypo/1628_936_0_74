package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.Validation.constraints.NotNull;
import jakarta.Validation.constraints.Size;
import jakarta.Validation.constraints.Email;
import jakarta.Validation.constraints.Max;
import jakarta.Validation.constraints.Positive;
@Entity
public class ValidationEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=8,meaasge="must be 2 to 8 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Max(6)
    @NotNull(message="password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="age must be positive ")
    private Integer age;
}