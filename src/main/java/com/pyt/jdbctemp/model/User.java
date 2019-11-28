package com.pyt.jdbctemp.model;

//import java.util.Set;
//
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.relational.core.mapping.Column;
//import org.springframework.data.relational.core.mapping.Table;
//
//@EntityScan
//@Table(value ="user")
//public class User {
//	@Id
//	@Column(value="user_id")
//	private int id;
//	@Column(value="name")
//	private String name;
//	@Column(value="username")
//	private String username;
//	@Column(value="password")
//	private String password;
//	@Column(value="active")
//	private int active;
//	public User() {
//		
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public int getActive() {
//		return active;
//	}
//	public void setActive(int active) {
//		this.active = active;
//	}
//	
//}

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -9067986418908847017L;
    @Id
    private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="active")
	private int active;

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}