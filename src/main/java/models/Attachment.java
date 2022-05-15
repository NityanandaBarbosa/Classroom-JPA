package models;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.io.FilenameUtils;

import utils.ReadLob;

@Entity
@Table (name = "tbl_attachment")
public class Attachment {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Activity activity;
	
	@OneToOne
	private User user;
	
	@Column
	private String fileName;
	
	@Column
	private String fileType;
	
	@Lob
	private byte [] fileLob ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void uploadFile(String path) throws IOException {
		this.fileName = FilenameUtils.removeExtension(FilenameUtils.getName(path));
		this.fileType = FilenameUtils.getExtension(path);
		this.fileLob = new ReadLob().getFoto(path);
	}
		
}
