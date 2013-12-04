package org.doosoft.spring.dataaccess.mybatis.repository;

import java.util.List;

import org.doosoft.spring.dataaccess.mybatis.domain.User;

public interface UserMapper {
	
	List<User> findAll();
	
	User findById(Long id);
	
	User find(User user);
	
	void insert(User user);
	
}
