package br.com.devdojo.awesome.repository;

import java.util.List;

import br.com.devdojo.awesome.model.Student;

public interface StudentRepository /*extends CrudRepository <Student, Long> */{
List<Student> findByName(String name);
Student findOne(Long id);
}