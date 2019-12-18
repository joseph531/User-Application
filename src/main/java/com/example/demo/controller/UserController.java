package com.example.demo.controller;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public class UserController {

  private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

 @Autowired
  private UserService userService;


  @RequestMapping(value = "", method = RequestMethod.GET)
  private List<User>  getAllUsers()
  {
    LOGGER.info("Get All User");
      return userService.getAllUsers();
  }

  @RequestMapping(value = "/userId/{userId}",method = RequestMethod.GET)
  private Optional<User> getUser(@PathVariable String userId){
    return  userService.getUser(userId);
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  private User createUser(@RequestBody User user)
  {
    LOGGER.info("Creating User : {}",user);
    return userService.createUser(user);
  }

  @RequestMapping(value = "/name/{name}",method = RequestMethod.GET)
  private User getUserByName(@PathVariable String name)
  {
    return userService.getUserByName(name);
  }

  @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
  private void deleteAll()
  {
    userService.deleteAll();
  }

  @RequestMapping(value = "/deleteById/{userId}", method = RequestMethod.DELETE)
  private void deleteById(@PathVariable String userId)
  {
    userService.deleteById(userId);
  }
}
