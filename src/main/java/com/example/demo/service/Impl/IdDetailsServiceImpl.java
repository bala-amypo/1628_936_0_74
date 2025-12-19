package com.example.demo.service.Impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity. IdDetails;
import com.example.demo.repository.IdDetailsRepository;
import com.example.demo.service. IdDetailsService;





@Service
public class  IdDetailsServiceImpl implements  IdDetailsService{
    @Autowired  IdDetailsRepository detail;
    @Override

   public  IdDetails postDatas( IdDetails ids){
    return detail.save(ids);
   }
}