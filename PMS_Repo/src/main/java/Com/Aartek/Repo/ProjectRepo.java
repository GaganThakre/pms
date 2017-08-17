package Com.Aartek.Repo;

import java.util.List;

 
 


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Com.Aartek.Model.Project;
 
 
 
@Repository("Project")
public class ProjectRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	 
	/*for SAVE  records*/
	public Project saveproject(Project project)   {
		System.out.println("inside project repo");
		 hibernateTemplate.save(project);
			return project;		 		
	}
	/*for all in db*/
	public List<Project> getProjects() {
		List<Project> projectList = (List<Project>) hibernateTemplate.find("from Project ");
		return projectList;
	}
	
	
   /*for single recorfetch*/
	
	public List<Project> getsinglerow(Project p) {
		
		System.out.println("repo"+p.getProjectid());
	
		List<Project> projectList = (List<Project>) hibernateTemplate.find("from Project where projectid=?",p.getProjectid());
		return projectList  ;
	}
	
	 
	
	
	 
	
	/*for update  records*/
	public Project update(Project project)   {

		System.out.println(" repo update"  +project.getEndDate());
		
		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		 
		 Session session = sessionFactory.openSession();
		 
		 Transaction tx = session.beginTransaction();
		 
	       session.update(project);
		       
		       
		       tx.commit();
			     session.close();
		 
		return project;		
	}
	
	/*for delete data from db*/
	
	public int delete(Project project) {
		
		
		 SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		 
		 Session session = sessionFactory.openSession();
		 
		 Transaction tx = session.beginTransaction();
		
		      session.delete(project);
		     
		     tx.commit();
		     session.close();
		     return (int) project.getProjectid();
		   
		
	}
	
	
}
