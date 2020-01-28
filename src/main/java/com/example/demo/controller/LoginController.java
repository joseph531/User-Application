package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.LoginService;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class LoginController {

  private final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

  @Autowired
  private LoginService loginService;

  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public Map<String, String> checkUser(@RequestBody Login login)
  {
    if(loginService.checkUser(login))
    {
      Map<String,String> map = new HashMap<>();
      map.put("token","true");
      LOGGER.info("Login Successful");
      return map;
    }

    return null;
  }

}
