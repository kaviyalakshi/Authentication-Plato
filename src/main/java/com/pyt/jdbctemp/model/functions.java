package com.pyt.jdbctemp.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class functions {
	@Id
	private Integer function_id;
	@Column(name="function_name")
	private String function_name;
}
