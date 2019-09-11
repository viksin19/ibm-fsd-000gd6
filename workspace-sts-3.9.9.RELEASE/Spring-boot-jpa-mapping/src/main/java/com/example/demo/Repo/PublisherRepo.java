package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Publisher;

public interface PublisherRepo extends JpaRepository<Publisher, Long> {

}
