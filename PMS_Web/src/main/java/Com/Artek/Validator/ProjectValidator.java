package Com.Artek.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Com.Aartek.Model.Project;
 
@Component
public class ProjectValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Project.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		 
		 Project project = (Project)target;
		 
		 

	    	 
	         ValidationUtils.rejectIfEmpty(errors, "ProjectName", "error.name.empty");
	      
	    	 
		     ValidationUtils.rejectIfEmpty(errors, "Client", "error.name.empty");
		     ValidationUtils.rejectIfEmpty(errors, "StartDate", "error.name.empty");
		     ValidationUtils.rejectIfEmpty(errors, "EndDate", "error.name.empty");
		     
		     
		   
	}

}
