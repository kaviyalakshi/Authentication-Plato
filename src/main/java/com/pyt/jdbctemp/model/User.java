package com.pyt.jdbctemp.model;

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
    private Integer user_id;
	@Column(name="name")
	private String name;
	@Column(name="username")
	private String username;
	@Column(name="designation_id")
	private Integer designation_id;
	@Column(name="function_role_map_id")
	private Integer function_role_map_id;
	@Column(name="password")
	private String password;
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(Integer designation_id) {
		this.designation_id = designation_id;
	}

	public Integer getFunction_role_map_id() {
		return function_role_map_id;
	}

	public void setFunction_role_map_id(Integer function_role_map_id) {
		this.function_role_map_id = function_role_map_id;
	}

	@Column(name="active")
	private int active;

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