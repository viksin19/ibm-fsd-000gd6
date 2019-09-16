package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;
@Repository
public interface MovieRepo extends CrudRepository<Movie, Integer> {

}
