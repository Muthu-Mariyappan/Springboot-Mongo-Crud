package com.gmm.entities;

//Author: Muthu Mariyappan G

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Entity class Represents the record in student table

@Document(collection = "student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private BigInteger id;
	private String name;
	private Double cgpa;
	private String departmentName;
	
	public Student() {}
	
	public Student(String name,Double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public Student(BigInteger id,String name,Double cgpa,String deptname) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.departmentName = deptname;
	}
	
	@Id
	public BigInteger getId() {
		return this.id;
	}
	
	public void setId(BigInteger id) {
		this.id = id;
	}
	

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	

	public Double getCgpa() {
		return this.cgpa;
	}
	
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getDepartmentName() {
		return this.departmentName;
	}
	
	public void setDepartmentName(String dname) {
		this.departmentName = dname;
	}
	
	@Override
    public String toString() {
        return "User{" +
                ", Name = '" + name + '\'' +
                ", CGPA = " + cgpa +
                '}';
    }
}