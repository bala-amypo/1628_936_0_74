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
    @Size(min=2,max=8,meaasge="must be 2 to 8 characters")
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
    private Integer age;

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
      public Integer getaget(){
        return age;
      }
      public void setaget(Integer age){
        this.age=age;
      }
      public ValidationEntity(Long id,
      @NotNull @Size(min=2,max=8,meaasge="must be 2 to 8 characters")String username,
      @NotNull @Email(message="Email is not valid")String email,
      @Size(min=2,max=8,message="must be 2 to 8 characters") @NotNull(message="password is mandatory")String password,
    @Max(30) @Positive(message="age must be positive ") @NotNull 
      )
}