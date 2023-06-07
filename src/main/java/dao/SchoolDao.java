package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.SchoolInsertDto;

public class SchoolDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public String insert(SchoolInsertDto schoolInsertDto)
	{
		entityTransaction.begin();
		entityManager.persist(schoolInsertDto);
		entityTransaction.commit();
		
		return "data inserted successfully..!!";
	}
	
	public SchoolInsertDto login(String username)
	{
		SchoolInsertDto schoolInsertDto = entityManager.find(SchoolInsertDto.class, username);
		return schoolInsertDto;
	}
}
