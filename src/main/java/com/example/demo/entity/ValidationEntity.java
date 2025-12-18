package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
@Entity
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
   @Size(min=18,max=30,message="must be 18 to 30 characters")
    @Positive(message="age must be positive ")
    @NotNull
    private int age;

      public Long getId(){
        return id;
      }
      public void setId(Long id){
        this.id=id;
      }
      public String getuserName(){
        return username;
      }
      public void setuserName(String username){
        this.username=username;
      }
      public String getEmail(){
        return email;
      }
      public void setEmail(String email){
        this.email=email;
      }
      public String getPassword(){
        return password;
      }
      public void setPassword(String password){
        this.password=password;
      }
      public int getAge(){
        return age;
      }
      public void setage(int age){
        this.age=age;
      }
      public ValidationEntity(Long id,
      @NotNull @Size(min=2,max=8,message="must be 2 to 8 characters")String username,
      @NotNull @Email(message="Email is not valid")String email,
      @Size(min=2,max=8,message="must be 2 to 8 characters") @NotNull(message="password is mandatory")String password,
    @Size(min=18,max=30,message="must be 18 to 30 characters") @Positive(message="age must be positive ") @NotNull int age
      ){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
      }
      public ValidationEntity(){

      }
}