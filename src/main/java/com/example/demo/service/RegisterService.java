package com.example.demo.service;

import com.example.demo.dao.RegisterDAO;
import com.example.demo.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

  @Autowired
  private RegisterDAO registerDAO;

  public Register registerUser(Register register){
    return  registerDAO.registerUser(register);
  }

}
