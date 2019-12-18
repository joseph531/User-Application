package com.example.demo.dao;

import com.example.demo.Repository.UserRepository;
import com.example.demo.controller.UserController;
import com.example.demo.entity.User;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

  private final Logger LOGGER = LoggerFactory.getLogger(UserDAO.class);

  @Autowired
  private final UserRepository userRepository;

  public UserDAO(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  public List<User> getAllUsers()
  {
    LOGGER.info("All records : {}", userRepository.findAll());
    return userRepository.findAll();
  }


  public Optional<User> getUser(String userId)
  {
    return userRepository.findById(userId);
  }


  public User createUser(User user)
  {
    LOGGER.info("sending user : {}", user);
    return userRepository.save(user);
  }


  public User getUserByName(String name)
  {
    return userRepository.findUserByName(name);
  }


  public void deleteAll()
  {
    userRepository.deleteAll();
  }



  public void deleteById(String userId)
  {
    userRepository.deleteById(userId);
  }
}
