package Hb;

import javax.persistence.*;

@Entity
@Table(name = "Student_Info")
public class Student_info {

	private String rollno,st_name;
	private Address add;
	
	@Id
	@Column(name="RollNo",length = 50)
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Column(name = "St_Name",length = 50)
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	
	@ManyToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
