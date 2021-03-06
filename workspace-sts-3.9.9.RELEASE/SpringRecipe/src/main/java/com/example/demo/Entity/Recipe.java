package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cook_time;
	private int prep_time;
	private String description;
	private String source_url;
	private String difficulty_level;
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			mappedBy = "recipe")
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	@OneToOne(cascade = CascadeType.ALL)
	private NoteDesc note;

	public Recipe() {
		super();
	}

	public Recipe(int cook_time, int prep_time, String description, String source_url, String difficulty_level) {
		super();
		this.cook_time = cook_time;
		this.prep_time = prep_time;
		this.description = description;
		this.source_url = source_url;
		this.difficulty_level = difficulty_level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCook_time() {
		return cook_time;
	}

	public void setCook_time(int cook_time) {
		this.cook_time = cook_time;
	}

	public int getPrep_time() {
		return prep_time;
	}

	public void setPrep_time(int prep_time) {
		this.prep_time = prep_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource_url() {
		return source_url;
	}

	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}

	public String getDifficulty_level() {
		return difficulty_level;
	}

	public void setDifficulty_level(String difficulty_level) {
		this.difficulty_level = difficulty_level;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public NoteDesc getNote() {
		return note;
	}

	public void setNote(NoteDesc note) {
		this.note = note;
	}





	
}
