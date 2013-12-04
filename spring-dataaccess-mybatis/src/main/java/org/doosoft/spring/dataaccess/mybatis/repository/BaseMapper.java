package org.doosoft.spring.dataaccess.mybatis.repository;

import java.util.List;

import org.doosoft.spring.dataaccess.mybatis.domain.User;

public interface BaseMapper<T> {
	
	List<User> findAll();

	User findById(Long id);

	User find(User user);

	void save(T entity);
	
}
