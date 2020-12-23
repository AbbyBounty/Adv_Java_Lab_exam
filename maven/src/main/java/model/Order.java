package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;

	private int quantity;
	private String uname;
	private String usermail;
	private String address;
	private Date date;
	private float totalprice;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	public Order(int pid, String pname, int quantity, String uname, String usermail, String address, Date date,
			float totalprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.quantity = quantity;
		this.uname = uname;
		this.usermail = usermail;
		this.address = address;
		this.date = date;
		this.totalprice = totalprice;
	}
	public Order() {
		
	}
	@Override
	public String toString() {
		return "Order [pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", uname=" + uname + ", usermail="
				+ usermail + ", address=" + address + ", date=" + date + ", totalprice=" + totalprice + "]";
	}

	
	



	


	

}
