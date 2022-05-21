package straumann.com.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	@Id @GeneratedValue
	@Column
	private int ID;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private int cost;
	
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Item(int iD, String name, String description, int cost) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
		this.cost = cost;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
