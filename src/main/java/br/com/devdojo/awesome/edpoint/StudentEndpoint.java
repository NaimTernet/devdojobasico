package br.com.devdojo.awesome.edpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity <?> ListAll() {
        return new ResponseEntity <>(new Student(0,"Deku"), HttpStatus.OK);
    }
}





