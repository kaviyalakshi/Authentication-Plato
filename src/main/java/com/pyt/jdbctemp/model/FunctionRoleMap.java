package com.pyt.jdbctemp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "function_role_map_id")
public class FunctionRoleMap {
	@Id
    private Integer function_role_map_id;
	@Column(name="function_id")
	private Integer function_id;
	@Column(name="role_id")
	private Integer role_id;
	
}
