package com.programmingfoundation.onlinefashionstore.dao;

import com.programmingfoundation.onlinefashionstore.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends MongoRepository<Product,String> {

}
