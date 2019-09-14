package com.example.demo;


import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {
         
	private EntityManager em;
	private Session session;
	@Autowired
	public StudentDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	public StudentDaoImpl() {
		super();
		session =em.unwrap(Session.class);
	}

	@Override
	@Transactional
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		session.saveOrUpdate(student); 

	}

	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		Query<Student> query = session.createQuery("from Student", Student.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		Student std = session.find(Student.class, id);
		session.delete(std);
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		session.merge(student);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		Student std = session.find(Student.class, id);
		return std;
	}

}
