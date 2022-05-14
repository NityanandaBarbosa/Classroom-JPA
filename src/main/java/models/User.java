package models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "user_name")
	private String nome;
	
	@Column(unique = true)
	private String  email; 
	
	@ManyToMany
	private Collection<Discipline> classes = new ArrayList<Discipline>();
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public Collection<Discipline> getClasses() {
		return classes;
	}

	public void setClasses(Collection<Discipline> classes) {
		this.classes = classes;
	}
	
}
