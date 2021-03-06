package com.uillianleal.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uillianleal.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
