package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.ScoreInsertDto;

public class ScoreDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public String insert(ScoreInsertDto dto1)
	{
		entityTransaction.begin();
		entityManager.persist(dto1);
		entityTransaction.commit();
		
		return "data inserted..!!";
	}
	
	public ScoreInsertDto fetchById(long rollNumber)
	{
		ScoreInsertDto studentResult = entityManager.find(ScoreInsertDto.class, rollNumber);
		return studentResult;
	}
	
	public List<ScoreInsertDto> fetchAll()
	{
		Query query = entityManager.createQuery("select result from student_score result", ScoreInsertDto.class);
		List<ScoreInsertDto> resultList = query.getResultList();
		return resultList;
	}
	
	public String deleteById(long rollNumber)
	{
		ScoreInsertDto scoreInsertDto = entityManager.find(ScoreInsertDto.class, rollNumber);
		
		entityTransaction.begin();
		entityManager.remove(scoreInsertDto);
		entityTransaction.commit();
		
		return "selected roll number is deleted..!";
	}
	
	public String updateSubject(long rollNumber, String subject, int mark)
	{
		ScoreInsertDto scoreInsertDto = entityManager.find(ScoreInsertDto.class, rollNumber);
		if(subject != null && mark >= 0)
		{
			int total=0;
			double percentage=0;
			switch(subject) 
			{
				case "kannada":
				{
					scoreInsertDto.setKannada(mark);
					total = mark+scoreInsertDto.getEnglish()+scoreInsertDto.getHindi()+scoreInsertDto.getMaths()+scoreInsertDto.getSocial()+scoreInsertDto.getScience();
					percentage = (total*100)/600;
				}break;
				case "english":
				{
					scoreInsertDto.setEnglish(mark);
					total = mark+scoreInsertDto.getKannada()+scoreInsertDto.getHindi()+scoreInsertDto.getMaths()+scoreInsertDto.getSocial()+scoreInsertDto.getScience();
					percentage = (total*100)/600;
				}break;
				case "hindi":
				{
					scoreInsertDto.setHindi(mark);
					total = mark+scoreInsertDto.getEnglish()+scoreInsertDto.getKannada()+scoreInsertDto.getMaths()+scoreInsertDto.getSocial()+scoreInsertDto.getScience();
					percentage = (total*100)/600;
				}break;
				case "maths":
				{
					scoreInsertDto.setMaths(mark);
					total = mark+scoreInsertDto.getEnglish()+scoreInsertDto.getHindi()+scoreInsertDto.getKannada()+scoreInsertDto.getSocial()+scoreInsertDto.getScience();
					percentage = (total*100)/600;
				}break;
				case "social":
				{
					scoreInsertDto.setSocial(mark);
					total = mark+scoreInsertDto.getEnglish()+scoreInsertDto.getHindi()+scoreInsertDto.getMaths()+scoreInsertDto.getKannada()+scoreInsertDto.getScience();
					percentage = (total*100)/600;
				}break;
				default :
				{
					scoreInsertDto.setScience(mark);
					total = mark+scoreInsertDto.getEnglish()+scoreInsertDto.getHindi()+scoreInsertDto.getMaths()+scoreInsertDto.getSocial()+scoreInsertDto.getKannada();
					percentage = (total*100)/600;
				}
			}
			
			scoreInsertDto.setTotal_matks(total);
			scoreInsertDto.setPercentage(percentage);
			
			entityTransaction.begin();
			entityManager.merge(scoreInsertDto);
			entityTransaction.commit();
			
			return subject+" mark updated successfully..!";
		}
		else
			return "enter correct values..!";
	}
	
	public String updateDetail(long rollNumber, String detail, String detailchange)
	{
		ScoreInsertDto scoreInsertDto = entityManager.find(ScoreInsertDto.class, rollNumber);
		if(detail != null && detailchange != null)
		{
			//System.out.println(details+" "+detailschanges);
			switch (detail) 
			{
				case "studentname":
				{
					scoreInsertDto.setStudent_name(detailchange);
				}break;
				case "dob":
				{
					scoreInsertDto.setDate_of_birth(detailchange);
				}break;
				case "fathername":
				{
					scoreInsertDto.setFather_name(detailchange);
				}break;
				default:
				{
					scoreInsertDto.setMother_name(detailchange);
				}
			}
			entityTransaction.begin();
			entityManager.merge(scoreInsertDto);
			entityTransaction.commit();
			
			return detail+" updated successfully...!";
		}
		else
			return "fill the details correctly...!";
	}
	
	public String updateall(ScoreInsertDto scoreInsertDto)
	{
		entityTransaction.begin();
		entityManager.merge(scoreInsertDto);
		entityTransaction.commit();
		
		return "updated the details..!";
	}
}
