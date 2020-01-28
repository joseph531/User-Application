package com.example.demo.service;

import com.example.demo.dao.LoginDAO;
import com.example.demo.entity.Login;
import com.example.demo.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

  @Autowired
  private LoginDAO loginDAO;


  public boolean checkUser(Login login)
  {
    Register register = loginDAO.checkUser(login.getUsername());


      String tmpUsername = register.getUsername();
      String tmpPassword = register.getPassword();
      if(tmpUsername.equals(login.getUsername()) && tmpPassword.equals(login.getPassword()))
      {
        return true;
      } else {
        return false;
      }



  }
}
