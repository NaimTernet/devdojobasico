package br.com.devdojo.awesome.model;

import java.util.ArrayList;
import java.util.List;



public class Student {
    private int id;
	private String name;
	public static List<Student> studentList;
	
	public Student(int id, String name) {
		this(name);
		this.id = id;
	}
	public Student(String name) {
		this.name = name;
	}
	
	
	public Student() {
	}	
	
//	private static void studentRepository(){
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

	
	
	
	

		
		
		