package com.gmm.services;

import java.math.BigInteger;

//Author: Muthu Mariyappan G


import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmm.entities.Student;

import com.gmm.repositories.StudentRepository;


@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Optional<Student> find(BigInteger id) {
		
		return this.studentRepository.findById(id);
	}

	@Override
	public Student insert(Student student) {
		
		return this.studentRepository.save(student);
	}

	@Override
	public Student update(Student student) {

		return this.studentRepository.save(student);
	}

	@Override
	public boolean delete(Student student) {
		this.studentRepository.delete(student);
		return true;
	}

	@Override
	public Iterable<Student> findAll() {
		return this.studentRepository.findAll();
	}

	@Override
	public void deleteAll() {
		this.studentRepository.deleteAll();
	}
}
