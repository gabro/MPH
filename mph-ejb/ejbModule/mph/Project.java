package mph;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Gabriele
 *
 */
@Entity
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@ManyToOne @JoinColumn(name="professor_id")
	private Professor professor;

	@OneToMany(mappedBy="project", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Group> groups;

	//Getters and setters
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return
	 */
	public Professor getProfessor() {
		return professor;
	}
	
	/**
	 * @param professor
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * @return
	 */
	public List<Group> getGroups() {
		return groups;
	}

	/**
	 * @param groups
	 */
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
}
