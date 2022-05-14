package models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_comment")
public class Comment {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Activity activ;
	
	@ManyToOne
	private User user;

	@Column
	private String message;
	
	@ManyToOne
	private User professorId;

	@Column
	private Date createTime = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Activity getActiv() {
		return activ;
	}

	public void setActiv(Activity activ) {
		this.activ = activ;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User getProfessorId() {
		return professorId;
	}

	public void setProfessorId(User professorId) {
		this.professorId = professorId;
	}
	
	
}
