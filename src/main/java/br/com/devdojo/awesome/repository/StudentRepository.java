package br.com.devdojo.awesome.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.devdojo.awesome.model.Student;



public interface StudentRepository extends CrudRepository<Student, Long> {
List<Student> findByNameIgnoreCaseContaining (String name);

}
