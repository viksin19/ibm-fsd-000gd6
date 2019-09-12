package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Recipe;
@Repository
public interface RecipeRepo extends CrudRepository<Recipe, Integer> {

}
