package Com.Aartek.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

 

@Entity
@Table(name="project")
public class Project {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long projectid;
	
	private String ProjectName;
	 
	 
	public long getProjectid() {
		return projectid;
	}
	public void setProjectid(long projectid) {
		this.projectid = projectid;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	private String Client;
	
	

	 @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date StartDate;

	 @DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date EndDate;
	
	
	 
}
