package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Max;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ValidationEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=8,message="must be 2 to 8 characters")
    private String username;
    @NotNull
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2,max=8,message="must be 2 to 8 characters")
    @NotNull(message="password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="age must be positive ")
    @NotNull
    private int age;
}