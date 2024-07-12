package Hb;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
	private String add_id,add1,add2,street;
	private Student_info stud;
	
	@Id
	@Column(name="add_id",length = 30)
	public String getAdd_id() {
		return add_id;
	}
	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}
	@Column(name="Add1",length = 100)
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	@Column(name="Add2",length = 100)
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	@Column(name="Street",length = 100)
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@OneToOne(targetEntity = Student_info.class,cascade = CascadeType.ALL)
	public Student_info getStud() {
		return stud;
	}
	public void setStud(Student_info stud) {
		this.stud = stud;
	}
	
	
}
