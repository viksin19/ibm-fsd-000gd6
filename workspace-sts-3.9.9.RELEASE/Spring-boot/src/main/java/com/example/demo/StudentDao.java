package com.example.demo;

import java.util.List;

public interface StudentDao {
 
	public List<Student> getStudents();
	public void deleteStudent(int id);
	public void updateStudent(Student student);
	public void createStudent(Student student);
	public Student findById(int id);
}