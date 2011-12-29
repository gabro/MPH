package mph;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student extends User {
	private static final long serialVersionUID = 1L;

	private String matrNo;
	private Group group;
	
	//Getters and setters
	public String getMatrNo() {
		return matrNo;
	}
	public void setMatrNo(String matrNo) {
		this.matrNo = matrNo;
	}
	
	@ManyToOne @JoinColumn(name="group_id")
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public List<Student> getStudents() {
		//TODO stub
		return null;
	}
}
