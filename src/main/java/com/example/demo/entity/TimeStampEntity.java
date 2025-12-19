package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime ;
import jakarta.persistence.Prepersist;


@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;
      private String name;
      private String email;
      private LocalDateTime createAt;
      private LocalDateTime updateAt;
@Prepersist
public void Oncreate(){
  LocalDateTime now= new LocalDateTime();
  this.createAt=now;
  this.updateAtt=now;
}
}