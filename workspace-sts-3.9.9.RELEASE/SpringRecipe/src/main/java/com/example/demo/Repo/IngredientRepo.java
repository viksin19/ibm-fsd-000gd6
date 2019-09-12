package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Ingredient;
@Repository
public interface IngredientRepo extends CrudRepository<Ingredient, Integer> {

}
