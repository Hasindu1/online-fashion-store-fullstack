package com.programmingfoundation.onlinefashionstore.dao;

import com.programmingfoundation.onlinefashionstore.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentDAO extends MongoRepository<Payment,String> {

}
