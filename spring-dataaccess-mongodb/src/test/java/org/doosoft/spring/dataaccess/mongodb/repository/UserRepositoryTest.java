package org.doosoft.spring.dataaccess.mongodb.repository;

import static com.lordofthejars.nosqlunit.mongodb.MongoDbRule.MongoDbRuleBuilder.newMongoDbRule;

import java.util.List;

import org.doosoft.spring.dataaccess.mongodb.domain.User;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mongodb-context.xml" })
public class UserRepositoryTest {

	@Rule
	public MongoDbRule remoteMongoDbRule = newMongoDbRule()
			.defaultSpringMongoDb("test");

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	UserRepository userRepository;

	@Test
	@UsingDataSet(locations = "userInitialData.json")
	public void testFinAll() {
		List<User> userList = userRepository.findAll();
		Assert.assertEquals(1, userList.size());
	}

}
