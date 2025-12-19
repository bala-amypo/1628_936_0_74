package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.IdDetails;
import com.example.demo.service.IdDetailsService;
import java.util.List;

@RestController
public class IdDetailsController{
@Autowired IdDetailsService idd;

@PostMapping("/idc")
public IdDetails sendData(@RequestBody IdDetails ids){
    return idd.postDatas(ids);
   }
   }