package clients;

import java.io.IOException;

import javax.persistence.EntityManager;

import models.Activity;
import models.Attachment;
import models.Comment;
import models.Discipline;
import models.User;
import utils.JpaUtils;

public class ClientAluno {
	public static void main(String[] args) throws IOException {
		
		EntityManager manager = JpaUtils.getEntityManager();
		
		manager.getTransaction().begin();
		User teacher = new User();
		User studant = new User();
		Discipline disc1 = new Discipline();
		Activity activ1 = new Activity();
		Comment publicComment = new Comment();
		Comment privateComment = new Comment();
		Attachment attachProfessor = new Attachment();
		Attachment attachStudent = new Attachment();
		
		teacher.setNome("nityananda barbosa");
		teacher.setEmail("nity@gmail.com");
		
		studant.setNome("damodara barbosa");
		studant.setEmail("damo@gmail.com");
		
		disc1.setName("TJW");
		disc1.setOwner(teacher);
		disc1.getStudents().add(studant);
		
		activ1.setTittle("Teste");
		activ1.setDescription("TATATTATAT");
		activ1.setDiscipline(disc1);
		teacher.getClasses().add(disc1);
		studant.getClasses().add(disc1);
		
		attachStudent.setActivity(activ1);
		attachStudent.setUser(studant);
		attachStudent.uploadFile("/classroom/src/main/resources/assets/JPA-hibernate.jpg");
		activ1.getAttachs().add(attachStudent);
		
		attachProfessor.setActivity(activ1);
		attachProfessor.setUser(teacher);
		attachProfessor.uploadFile("/classroom/src/main/resources/assets/video_drop_phone.mp4");
		activ1.getAttachs().add(attachProfessor);
		
		publicComment.setUser(teacher);
		publicComment.setMessage("Opa, boa tarde professor");
		publicComment.setActiv(activ1);
		activ1.getComments().add(publicComment);
		
		privateComment.setUser(studant);
		privateComment.setProfessorId(activ1.getDiscipline().getOwner());
		privateComment.setMessage("Opa, boa tarde damodara");
		privateComment.setActiv(activ1);
		activ1.getComments().add(privateComment);
		
		activ1.setNota(9.2);
		
		manager.persist(teacher);
		manager.persist(studant);
		manager.persist(disc1);
		manager.persist(activ1);
		manager.persist(attachProfessor);
		manager.persist(attachStudent);
		manager.persist(publicComment);
		manager.persist(privateComment);
		manager.getTransaction().commit();
		manager.close();
	}
}
