package mph;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private Deliverable deliverable;
	private Group group;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne @JoinColumn(name="deliverable_id")
	public Deliverable getDeliverable() {
		return deliverable;
	}
	public void setDeliverable(Deliverable deliverable) {
		this.deliverable = deliverable;
	}
	
	@ManyToOne @JoinColumn(name="group_id")
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public List<Document> getDocuments() {
		//TODO stub
		return null;
	}
	
}
