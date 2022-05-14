package models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Activity {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String tittle;
	
	@Column
	private String description;
	
	@ManyToOne
	private Discipline discipline;
	
	@ManyToMany
	private Collection<User> students = new ArrayList<User>();
}
