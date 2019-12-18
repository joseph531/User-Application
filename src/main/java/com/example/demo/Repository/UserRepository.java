package com.example.demo.Repository;

import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

  public User findUserByName(String name);

 // @Query("select user from user where user.name =: somename")
  //public User findJosefName(@Param("somename") String name);

}
