package Com.Aartek.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Aartek.Model.User;
import Com.Aartek.Repo.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	public User userlogin(User user)  {
		System.out.println("inside service");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		//loginRepository.userlogin(user);
         loginRepository.Userlog(user);
		return user;
		
	}
 
}
