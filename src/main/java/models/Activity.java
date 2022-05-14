package models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_activity")
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
	
	@OneToMany
	private Collection<Comment> comments = new ArrayList<Comment>();
	
	@OneToMany
	private Collection<Attachment> attachs = new ArrayList<Attachment>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	public Collection<Attachment> getAttachs() {
		return attachs;
	}

	public void setAttachs(Collection<Attachment> attachs) {
		this.attachs = attachs;
	}
}
