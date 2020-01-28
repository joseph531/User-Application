package com.example.demo.Repository;

import com.example.demo.entity.Login;
import com.example.demo.entity.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterRepository extends MongoRepository<Register,String> {

  public Register findRegisterByUsername(String username);

}
