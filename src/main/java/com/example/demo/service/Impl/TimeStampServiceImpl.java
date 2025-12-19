package com.example.demo.service.Impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;



@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired TimeStampRepository  time;
    @Override

   public TimeStampEntity postData(TimeStampEntity tym){
    return time.save(tym);
   }
}