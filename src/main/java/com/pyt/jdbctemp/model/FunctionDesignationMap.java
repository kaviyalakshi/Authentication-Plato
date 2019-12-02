package com.pyt.jdbctemp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "function_designation_id")
public class FunctionDesignationMap {
	@Id
    private Integer function_designation_map_id;
	@Column(name="function_id")
	private Integer function_id;
	@Column(name="role_id")
	private Integer role_id;
	@Column(name="designation_id")
	private String designation_id;
}
