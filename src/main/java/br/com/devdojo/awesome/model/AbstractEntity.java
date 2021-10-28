package br.com.devdojo.awesome.model;

import java.io.Serializable;
import java.util.Objects;

public class AbstractEntity implements Serializable {
	//@Id
	//@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false; 	
		if (getClass() != obj.getClass()) return false;
		
		AbstractEntity other = (AbstractEntity) obj;
		
		return Objects.equals(id, other.id);
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	{
}

}
