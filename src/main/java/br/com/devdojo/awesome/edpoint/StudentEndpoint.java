package br.com.devdojo.awesome.edpoint;

import br.com.devdojo.awesome.error.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import br.com.devdojo.awesome.model.Student;
import br.com.devdojo.awesome.util.DateUtil;

@RestController
@RequestMapping("students")
public class StudentEndpoint {
    private final DateUtil dateUtil;

    @Autowired
    public StudentEndpoint(DateUtil dateUtil) {
        this.dateUtil = dateUtil;

    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> ListAll() {
        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
        Student student = new Student();
        student.setId(id);
        int index = Student.studentList.indexOf(student);
        if (index == -1) return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public RequestEntity<?> save(@RequestBody Student student) {
//        Student.studentList.add(student);
//        return new ResponseEntity<>(student, HttpStatus.OK);
//    }

//    @RequestMapping(method = RequestMethod.DELETE)
//    public RequestEntity<?> delete(@RequestBody Student student) {
//        Student.studentList.remove(student)
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    public RequestEntity<?> update(@RequestBody Student student) {
//      Student.studentList.remove(student);
//       student.studentList.add(student);
//      return new ResponseEntity<>(HttpStatus.OK);
//    }



}


