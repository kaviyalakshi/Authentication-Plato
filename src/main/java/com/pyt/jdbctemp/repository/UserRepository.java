package com.pyt.jdbctemp.repository;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;

import com.pyt.jdbctemp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
//@Autowired
//JdbcTemplate jdbcTemplate;
//	public List<String> getAllUserName() {
//		List <String> usernameList = new ArrayList<>();
//		usernameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
//		return usernameList;
//	}
	User getUserByUsername(String username);
}