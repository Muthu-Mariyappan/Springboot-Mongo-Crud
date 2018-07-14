package com.gmm.repositories;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;


//Author: Muthu Mariyappan G

import org.springframework.stereotype.Repository;

import com.gmm.entities.Student;

@Repository("studentRepository") // sets role - marks this as DAO -- Data access object
public interface StudentRepository extends MongoRepository<Student,BigInteger>{
		Student findByName(String name);
}