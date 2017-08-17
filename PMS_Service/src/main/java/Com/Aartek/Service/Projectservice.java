package Com.Aartek.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Aartek.Model.Project;
import Com.Aartek.Repo.ProjectRepo;

@Service
public class Projectservice {
	
	@Autowired
	ProjectRepo projectrepo;
	
	
	public Project projservice(Project pro) {
		
		System.out.println("inside project service");
		projectrepo.saveproject(pro);
		
		return pro;
		
	}
	
	public List<Project> getProjects() {
		List<Project> list = projectrepo.getProjects();
		return list;
	}
	
	
	
	 /*for single recorfetch*/
		
		public List<Project> getsinglerow(Project p) {
			List<Project> projectList = (List<Project>) projectrepo.getsinglerow(p);
			return (List<Project>) projectList;
		}
	       
	 
	/*for update*/
		
		
		
		public String update(Project project) {
			System.out.println(" service update");
			projectrepo.update(project);
			return null;
			
			
		}
	
	/*for calling delete method of repo*/
	
	public void delete(Project projectid) {
		System.out.println("service"+projectid.getProjectid());
		projectrepo.delete(projectid);
	}

}
