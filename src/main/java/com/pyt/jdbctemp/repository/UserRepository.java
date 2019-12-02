package com.pyt.jdbctemp.repository;


import org.springframework.data.repository.CrudRepository;

import com.pyt.jdbctemp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User getUserByUsername(String username);
}