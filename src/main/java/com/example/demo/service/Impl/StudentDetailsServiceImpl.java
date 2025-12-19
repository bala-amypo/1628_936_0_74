package com.example.demo.service.Impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.service. StudentDetailsService;





@Service
public class  StudentDetailsServiceImpl implements  StudentDetailsService{
    @Autowired  IdDetailsRepository detail;
    @Override

   public  StudentDetails postDatas( StudentDetails ids){
    return detail.save(ids);
   }
}