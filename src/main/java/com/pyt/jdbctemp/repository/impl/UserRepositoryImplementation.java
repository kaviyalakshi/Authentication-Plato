package com.pyt.jdbctemp.repository.impl;

//import org.hibernate.SessionFactory;
//import org.hibernate.query.NativeQuery;
//import org.hibernate.query.Query;
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
	@Autowired

    @Override
//    public User getUserByUsername(String username) {
//        Query<User> query = sessionFactory.getCurrentSession().createQuery("FROM user u where u.username=:username", User.class);
//        query.setParameter("username", username);
//        return query.uniqueResult();
//    }
    public User getUserByUsername(String username) {
//    	List <String> usernameList = new ArrayList<>(username);
    	 User a = (User) jdbcTemplate.queryForList("select name from user where username=:username;", String.class);
		return a;
		
	}
}