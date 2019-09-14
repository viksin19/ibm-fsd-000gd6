package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Author;
//import com.example.demo.Model.Book;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
