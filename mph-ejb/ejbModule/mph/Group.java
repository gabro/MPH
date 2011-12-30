package mph;

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
	
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	
	public List<Student> getMembers() {
		return members;
	}
	public void setMembers(List<Student> members) {
		this.members = members;
	}
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public void addStudent(Student student) throws GroupLimitReachedException {
		//TODO stub
	}
	
	public void delStudent(Student student) throws GroupEmptyException {
		//TODO stub
	}
	
	public void addDocument(Document document) {
		//TODO stub
	}
	
	public void delDocument(Document document) throws DocumentNotFoundException {
		//TODO stub
	}
	
	public List<Group> getGroups() {
		//TODO stub
		return null;
	}
}
