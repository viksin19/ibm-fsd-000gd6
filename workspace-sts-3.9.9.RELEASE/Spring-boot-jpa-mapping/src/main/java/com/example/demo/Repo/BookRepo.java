package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
