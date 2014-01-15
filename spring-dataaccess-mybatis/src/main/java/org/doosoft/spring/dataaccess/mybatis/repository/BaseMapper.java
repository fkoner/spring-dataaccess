package org.doosoft.spring.dataaccess.mybatis.repository;

import java.util.List;

import org.doosoft.spring.dataaccess.mybatis.domain.User;
import org.springframework.cache.annotation.Cacheable;

public interface BaseMapper<T> {
	
	@Cacheable("findAll")
	List<User> findAll();

	T findById(Long id);

	T find(T entity);

	void save(T entity);
	
}
