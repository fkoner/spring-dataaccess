package org.doosoft.spring.dataaccess.mongodb.repository;

import org.bson.types.ObjectId;
import org.doosoft.spring.dataaccess.mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
	
	

}
