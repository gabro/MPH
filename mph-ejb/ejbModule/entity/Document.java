package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Gabriele
 *
 */
@Entity
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne @JoinColumn(name="deliverable_id")
	private Deliverable deliverable;
	
	@ManyToOne @JoinColumn(name="group_id")
	private Group group;
	
	public Document() {}
	
	/**
	 * @param deliverable
	 * @param group
	 */
	public Document(Deliverable deliverable, Group group) {
		this.deliverable = deliverable;
		this.group = group;
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
	public Deliverable getDeliverable() {
		return deliverable;
	}
	
	/**
	 * @param deliverable
	 */
	public void setDeliverable(Deliverable deliverable) {
		this.deliverable = deliverable;
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
