package org.doosoft.spring.dataaccess.mybatis.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String username;
	
	private String fullname;
	
	private String firstname;
	
	private String lastname;
	
	private List<Role> roleList;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public List<Role> getRoleList() {
		return roleList;
	}
	
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
}
