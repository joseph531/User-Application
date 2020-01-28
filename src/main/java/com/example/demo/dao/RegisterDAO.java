package com.example.demo.dao;

import com.example.demo.Repository.RegisterRepository;
import com.example.demo.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterDAO {

  @Autowired
  private RegisterRepository registerRepository;

  public Register registerUser(Register register)
  {
    return registerRepository.save(register);
  }

}
