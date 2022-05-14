package clients;

import javax.persistence.EntityManager;

import models.Discipline;
import models.User;
import utils.JpaUtils;

public class ClientAluno {
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtils.getEntityManager();
		
		manager.getTransaction().begin();
		User teacher = new User();
		User studant = new User();
		Discipline disc1 = new Discipline();
		
		teacher.setNome("nityananda barbosa");
		teacher.setEmail("nity@gmail.com");
		
		studant.setNome("damodara barbosa");
		studant.setEmail("damo@gmail.com");
		
		disc1.setName("TJW");
		disc1.setOwner(teacher);
		disc1.getStudents().add(studant);
		
		manager.persist(teacher);
		manager.persist(studant);
		manager.persist(disc1);
		manager.getTransaction().commit();
		manager.close();
	}
}
