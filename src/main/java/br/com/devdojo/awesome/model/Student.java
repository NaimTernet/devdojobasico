package br.com.devdojo.awesome.model;

import javax.persistence.Entity;
import java.util.Deque;


@Entity
public class Student extends AbstractEntity {
    //public static Deque<Object>studenty;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}