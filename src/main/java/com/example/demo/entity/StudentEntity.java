package com.example.demo.entity;
@Entity

public class StudentEntity{
      private Integer id;
      private String name;
      private String email;
      private String password;
      private Date created;
      public Date getCreated(){
        return created;
      }
      public void setCreated(Date created){
        this.created=created;
      }
      public Integer getId(){
        return id;;
      }
      public void setId(Integer id){
        this.id=id;
      }
      public String getName(){
        return name;
      }
      public void setName(Date created){
        this.created=created;
      }
}