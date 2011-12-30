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
public class Deliverable implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne @JoinColumn(name="project_id")
	private Project project;
	
	@OneToMany(mappedBy="deliverable_id", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Document> documents;
	
	
	public Deliverable() {}
	
	/**
	 * @param project
	 */
	public Deliverable(Project project) {
		this.project = project;
	}
	
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
	public Project getProject() {
		return project;
	}
	
	/**
	 * @param project
	 */
	public void setProject(Project project) {
		this.project = project;
	}
	
	/**
	 * @return
	 */
	public List<Document> getDocuments() {
		return documents;
	}
	
	/**
	 * @param documents
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
}
