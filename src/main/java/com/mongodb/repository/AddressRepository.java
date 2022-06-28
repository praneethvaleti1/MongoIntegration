package com.mongodb.repository;

import com.mongodb.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, Integer> {
}
