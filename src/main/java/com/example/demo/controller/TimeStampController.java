package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;

@RestController
public class TimeStampController{
@Autowired TimeStampService tyms;

@PostMapping("/Times")
public TimeStampEntity sendData(@RequestBody TimeStampEntity tym){
    return tyms.postDataa(tym);
   }
}