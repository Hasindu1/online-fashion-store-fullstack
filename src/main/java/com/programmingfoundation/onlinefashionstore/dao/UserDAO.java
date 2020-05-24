package com.programmingfoundation.onlinefashionstore.dao;


import com.programmingfoundation.onlinefashionstore.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User,String> {

}
