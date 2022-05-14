package models;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_attachment")
public class Attachment {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Activity activity;
	
	@OneToOne
	private User user;
	
	@Column
	private Float nota;
	
	@Column
	private File attach;
}
