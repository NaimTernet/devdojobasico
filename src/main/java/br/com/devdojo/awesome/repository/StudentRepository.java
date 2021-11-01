package br.com.devdojo.awesome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.devdojo.awesome.model.Student;


//nesta query vai localizar por nome, ignorando o CameCase (maiusculo ou minusculo
//e ao inves de pesquisar o nome igual ao digitado, vai pesquisar palavras que contem o campo da busca

//query anterior
// select student0_.id as id1_0_, student0_.name as name2_0_ from student student0_ where student0_.name=?
// nova query customizada
// select student0_.id as id1_0_, student0_.name as name2_0_ from student student0_ where upper(student0_.name) like upper(?) escape ?

public interface StudentRepository extends CrudRepository<Student, Long> {
List<Student> findByNameIgnoreCaseContaining (String name);
//Student findOne(Long id);
}
