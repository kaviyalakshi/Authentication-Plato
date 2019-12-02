package com.pyt.jdbctemp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "designations")
public class Designation {
	@Id
    private Integer designation_id;
	@Column(name="role_id")
	private Integer role_id;
	@Column(name="designation_name")
	private String designation_name;
}
