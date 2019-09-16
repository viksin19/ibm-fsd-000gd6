package com.example.demo.entity.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;
@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {

}
