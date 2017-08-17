package Com.Aartek.Repo;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import Com.Aartek.Model.User;

@Repository
public class LoginRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	 
	
	public List<User> Userlog(User user) {
		String email= user.getEmail();
		String password = user.getPassword();
		
		if ( email != null && password != null) {
			List<User> login = (List<User>) hibernateTemplate.find(
					"from User al where al.email = ? and al.password = ?", email, password);
			
			for(User o: login) {
				System.out.println(o.getEmail());
				System.out.println(o.getPassword());
				
			}
			return login;
		} else {
			return null;
		}
	}

}
