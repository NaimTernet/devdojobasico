package br.com.devdojo.awesome.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



@Entity
public class Student extends AbstractEntity {

	@NotEmpty
	private String name;
	@Email
	private String email;
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




	public void setName(String name) {
		this.name = name;
	}
}