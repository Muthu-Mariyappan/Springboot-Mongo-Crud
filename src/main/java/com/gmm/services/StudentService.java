package com.gmm.services;

import java.math.BigInteger;

//Author: Muthu Mariyappan G


import java.util.Optional;

import com.gmm.entities.Student;


//Usage of interface for easier and flexible future developments

public interface StudentService {

	public Optional<Student> find(BigInteger id);
	public Student insert(Student student);
	public Student update(Student student);
	public boolean delete(Student student);
	public Iterable<Student> findAll();
	public void deleteAll();
}
