package Hb;
import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

	private String cus_id,cus_name,cus_email;
	private CTransaction trans;
	
	@Id
	@Column(name="cus_id",length=10)
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	
	@Column(name="Cus_name",length=30)
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	
	@Column(name="Cus_email",length=50)
	public String getCus_email() {
		return cus_email;
	}
	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}
	
	@OneToOne(targetEntity = CTransaction.class,cascade = CascadeType.ALL)
	public CTransaction getTrans() {
		return trans;
	}
	public void setTrans(CTransaction trans) {
		this.trans = trans;
	}
	
	
	
}
