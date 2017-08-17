package Com.Aartek.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Aartek.Model.User;
import Com.Aartek.Repo.RegistrationRepository;


@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository rgistrepo;
	
	
	public User regservice(User reg)  {
		System.out.println("inside registration service");
		rgistrepo.reg(reg);
		return reg;
		
	}
}
