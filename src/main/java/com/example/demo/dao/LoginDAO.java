package com.example.demo.dao;

import com.example.demo.Repository.RegisterRepository;
import com.example.demo.entity.Login;
import com.example.demo.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {

  @Autowired
  private RegisterRepository registerRepository;

  public Register checkUser(String username)
  {
    Register register = registerRepository.findRegisterByUsername(username);
    if(register!= null)
    {
      return register;
    } else
    {
      return null;
  }
  }

}
