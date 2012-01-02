package entity;

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

import exceptions.DocumentNotFoundException;
import exceptions.GroupEmptyException;
import exceptions.GroupLimitReachedException;

/**
 * @author Gabriele
 *
 */
@Entity
public class Group {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int finalScore;

	@OneToMany(mappedBy="group", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Student> members;
	
	@OneToMany(mappedBy="group", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Document> documents;
	
	@ManyToOne @JoinColumn(name="project_id")
	private Project project;
	
	public Group() {}
	
	/**
	 * @param project
	 */
	public Group(Project project) {
		this.project = project;
	}
	
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
	public int getFinalScore() {
		return finalScore;
	}
	
	/**
	 * @param finalScore
	 */
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	
	/**
	 * @return
	 */
	public List<Student> getMembers() {
		return members;
	}
	
	/**
	 * @param members
	 */
	public void setMembers(List<Student> members) {
		this.members = members;
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
	 * @param student
	 * @throws GroupLimitReachedException
	 */
	public void addStudent(Student student) throws GroupLimitReachedException {
		//TODO stub
	}
	
	/**
	 * @param student
	 * @throws GroupEmptyException
	 */
	public void delStudent(Student student) throws GroupEmptyException {
		//TODO stub
	}
	
	/**
	 * @param document
	 */
	public void addDocument(Document document) {
		//TODO stub
	}
	
	/**
	 * @param document
	 * @throws DocumentNotFoundException
	 */
	public void delDocument(Document document) throws DocumentNotFoundException {
		//TODO stub
	}
}
