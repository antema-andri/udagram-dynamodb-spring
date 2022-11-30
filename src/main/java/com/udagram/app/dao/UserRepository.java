package com.udagram.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udagram.app.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{

}
