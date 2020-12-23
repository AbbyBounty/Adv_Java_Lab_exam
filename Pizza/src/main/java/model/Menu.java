package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	private String pname;
	
	private String category;
	
	private float prize;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrize() {
		return prize;
	}

	public void setPrize(float prize) {
		this.prize = prize;
	}

	public Menu(int pid, String pname, String category, float prize) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.prize = prize;
	}

	public Menu() {
		super();
	}

	@Override
	public String toString() {
		return "Menu [pid=" + pid + ", pname=" + pname + ", category=" + category + ", prize=" + prize + "]";
	}
	
	
	
	

	
	
	
}
