package Com.Aartek.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

 
import Com.Aartek.Model.User;
@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public User reg(User regist)   {
		System.out.println("inside Registration repo");
		//System.out.println(regist.getName());
	
		
		 hibernateTemplate.saveOrUpdate(regist);
			
			return regist;
		
		 
		
	}
	
	
	public boolean UserReg(User user) {
		String email= user.getEmail();
		
			List login =  (List) hibernateTemplate.find(
					"select email from User al where al.email = ?", email);
			 
			if(login.isEmpty()) {
				
		    	return false;
			
			}else {
			
				return true;
			 }
		 
		 
	}
}
