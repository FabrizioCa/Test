package com.jakala.Test.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jakala.Test.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>
{
	List<User> findByName(String name);
	List<User> findByUserType(String userType);
}
