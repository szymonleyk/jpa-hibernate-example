package pl.szymonleyk.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class AddressRepository implements Repository<Address> {

	public void insert(Address address) {
		EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		try {
			et.begin(); // otwieram

			em.persist(address); // utrwalam obiekt w bazie

			et.commit(); // zapis
		} catch (Exception e) {
			et.rollback();
		}
	}

	public void delete(Address v) {

	}

	public Address select(int id) {
		EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
		EntityManager em = emf.createEntityManager();

		return em.find(Address.class, id);
	}

}
