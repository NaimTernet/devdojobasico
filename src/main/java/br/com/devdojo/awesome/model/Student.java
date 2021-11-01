package br.com.devdojo.awesome.model;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@javax.persistence.MappedSuperclass
public class Student extends AbstractEntity {
  
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}