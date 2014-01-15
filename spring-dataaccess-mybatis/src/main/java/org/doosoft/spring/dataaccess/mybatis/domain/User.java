package org.doosoft.spring.dataaccess.mybatis.domain;

import java.io.Serializable;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;

public class User implements Auditable<String, Serializable>, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	private String username;
	
	private String fullname;
	
	private String firstname;
	
	private String lastname;
	
	private List<Role> roleList;
	
	private String createdBy;
	
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
	
	@Override
	public boolean isNew() {
		return false;
	}
	
	@Override
	public String getCreatedBy() {
		return createdBy;
	}
	
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public DateTime getCreatedDate() {
		return null;
	}

	@Override
	public void setCreatedDate(DateTime creationDate) {
		
	}

	@Override
	public String getLastModifiedBy() {
		return null;
	}

	@Override
	public void setLastModifiedBy(String lastModifiedBy) {
		
	}

	@Override
	public DateTime getLastModifiedDate() {
		return null;
	}

	@Override
	public void setLastModifiedDate(DateTime lastModifiedDate) {
		
	}
	
}
