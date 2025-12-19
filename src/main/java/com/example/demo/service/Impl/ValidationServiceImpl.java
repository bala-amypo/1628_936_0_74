package com.example.demo.service.Impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;


@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository Validation;
    @Override

   public ValidationEntity postData(ValidationEntity Validate){
    return Validation.save(Validate);
   }
   @Override
public ValidationEntity getDataById(Integer id){
    return Validate.findById(id);
}
}