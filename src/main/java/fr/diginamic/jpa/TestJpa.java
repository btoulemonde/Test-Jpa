package fr.diginamic.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("compta-jpa");
		EntityManager em = emf.createEntityManager();
		
		Fournisseur f = em.find(Fournisseur.class, 1);
		if(f != null){
			System.out.println(f.getNom());
		}
		em.close();
	}

}
