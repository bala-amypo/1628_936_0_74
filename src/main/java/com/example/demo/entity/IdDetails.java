package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class IdDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Long id;
      private Int cardnumber ;
      @OneToOne
      @JoinColumn
      private StudentDetails student;
}