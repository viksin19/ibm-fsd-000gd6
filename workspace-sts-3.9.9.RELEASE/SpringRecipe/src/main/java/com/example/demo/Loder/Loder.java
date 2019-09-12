package com.example.demo.Loder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Ingredient;
import com.example.demo.Entity.NoteDesc;
import com.example.demo.Entity.Recipe;
import com.example.demo.Repo.IngredientRepo;
import com.example.demo.Repo.NoteDescRepo;
import com.example.demo.Repo.RecipeRepo;
@Component
public class Loder implements ApplicationListener<ContextRefreshedEvent> {
	
	private RecipeRepo recipeRepo;
	private IngredientRepo ingredientRepo;
	private NoteDescRepo noteRepo;
	
     @Autowired
	 public Loder(RecipeRepo recipeRepo, IngredientRepo ingredientRepo, NoteDescRepo noteRepo) {
		super();
		this.recipeRepo = recipeRepo;
		this.ingredientRepo = ingredientRepo;
		this.noteRepo = noteRepo;
	}



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}



	public void init() {
		// TODO Auto-generated method stub
		
		Recipe recipe1 = new Recipe(20,40,"Sandwich","facebook","hard");
		 	
		Ingredient tomato = new Ingredient(4,"tomato");
		Ingredient potato = new Ingredient(10,"potato");
		Ingredient onion = new Ingredient(2,"onion");
		
		NoteDesc note1 = new NoteDesc("Keep It Clean");
		
		tomato.setRecipe(recipe1);
		potato.setRecipe(recipe1);
		onion.setRecipe(recipe1);
	
		recipe1.getIngredients().add(tomato);
		recipe1.getIngredients().add(potato);
		recipe1.getIngredients().add(onion);
		
		
		recipe1.setNote(note1);
		
         recipeRepo.save(recipe1);
         
         ingredientRepo.save(tomato);
 		 ingredientRepo.save(potato);
 		 ingredientRepo.save(onion);
 		
 		
 		
 		noteRepo.save(note1);
	}

}
