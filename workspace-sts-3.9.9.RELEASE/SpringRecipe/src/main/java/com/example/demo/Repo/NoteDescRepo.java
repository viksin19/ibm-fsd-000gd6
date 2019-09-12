package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.NoteDesc;
@Repository
public interface NoteDescRepo extends CrudRepository<NoteDesc, Integer> {

}
