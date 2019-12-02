package com.pyt.jdbctemp.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyt.jdbctemp.model.User;
import com.pyt.jdbctemp.repository.UserRepository;

@Repository
@Transactional
public abstract class UserRepositoryImplementation implements UserRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
    public User getUserByUsername(String username) {
    	User a = (User) jdbcTemplate.queryForList("select name from user where username=:username;", String.class);
		return a;
		
	}
}