package org.doosoft.spring.dataaccess.mybatis.repository;

import java.util.List;

import org.doosoft.spring.dataaccess.mybatis.domain.User;
import org.doosoft.spring.dataaccess.mybatis.repository.UserMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context-unit-test.xml" })
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFindAll() {
		List<User> userList = userMapper.findAll();
		Assert.assertEquals(2, userList.size());
	}
	
	@Test
	public void testFindById() {
		User user = userMapper.findById(new Long(1));
		Assert.assertEquals(new Long(1), user.getId());
	}
	
	@Test
	public void testFind() {
		User userInput = new User();
		userInput.setId(new Long(1));
		userInput.setUsername("user1");
		
		User user = userMapper.find(userInput);
		Assert.assertEquals(new Long(1), user.getId());
	}
	
	@Test
	public void testInsert() {
		User userInput = new User();
		userInput.setUsername("user3");
		userInput.setFirstname("User");
		userInput.setFullname("User Test 3");
		userInput.setLastname("Test");
		
		userMapper.insert(userInput);
		User user = userMapper.findById(new Long(3));
		Assert.assertEquals(new Long(3), user.getId());
	}

}
