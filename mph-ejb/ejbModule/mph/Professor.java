package mph;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * @author Gabriele
 *
 */
@Entity
public class Professor extends User {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="professor", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Project> projects;
	
	public Professor() {}
	
	/**
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 */
	public Professor(String username, String password, String firstName,
			String lastName, String matrNo) {
		super(username, password, firstName, lastName);
	}
	
	//Getters and setters
	/**
	 * @return
	 */
	public List<Project> getProjects() {
		return projects;
	}
	
	/**
	 * @param projects
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	/**
	 * @param project
	 */
	public void addProject(Project project) {
		//TODO stub
	}
	
	/**
	 * @param project
	 */
	public void delProject(Project project) {
		
	}
}