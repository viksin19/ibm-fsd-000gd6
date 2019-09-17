package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {

	List<User> findBylname(String lname);

}
