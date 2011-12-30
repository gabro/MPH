package mph;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Gabriele
 *
 */
@Entity
public class Student extends User {
	private static final long serialVersionUID = 1L;

	private String matrNo;

	@ManyToOne @JoinColumn(name="group_id")
	private Group group;
	
	public Student() {}

	/**
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param matrNo
	 */
	public Student(String username, String password, String firstName,
			String lastName, String matrNo) {
		super(username, password, firstName, lastName);
		this.matrNo = matrNo;
	}

	//Getters and setters
	/**
	 * @return
	 */
	public String getMatrNo() {
		return matrNo;
	}
	
	/**
	 * @param matrNo
	 */
	public void setMatrNo(String matrNo) {
		this.matrNo = matrNo;
	}
	
	/**
	 * @return
	 */
	public Group getGroup() {
		return group;
	}
	
	/**
	 * @param group
	 */
	public void setGroup(Group group) {
		this.group = group;
	}
}
