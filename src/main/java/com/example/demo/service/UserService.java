package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
 private  UserDAO userDAO;

public List<User> getAllUsers()
{
  return userDAO.getAllUsers();
}

public Optional<User> getUser(String userId)
{
  return userDAO.getUser(userId);
}

public User createUser(User user)
{
  return userDAO.createUser(user);
}


public User getUserByName(String name)
{
  return userDAO.getUserByName(name);
}

public void deleteAll()
{
  userDAO.deleteAll();
}

public void deleteById(String userId)
{
  userDAO.deleteById(userId);
}

}
