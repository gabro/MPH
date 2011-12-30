package mph;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Professor extends User {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="professor", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Project> projects;
	
	//Getters and setters
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void addProject(Project project) {
		//TODO stub
	}
	
	public void delProject(Project project) {
		
	}
	
	public List<Professor> getProfessors() {
		//TODO stub
		return null;
	}
}