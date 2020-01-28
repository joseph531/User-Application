package com.example.demo.controller;


import com.example.demo.entity.Register;
import com.example.demo.service.RegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class RegisterController {

  private final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

  @Autowired
  private RegisterService registerService;


  @RequestMapping(value = "/register",method = RequestMethod.POST)
  private Register registerUser(@RequestBody Register register)
  {
    LOGGER.info("Register user details : {}", register);
    Register registerRes = registerService.registerUser(register);
    return registerRes;
  }
}
