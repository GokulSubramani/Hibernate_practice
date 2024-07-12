package Hb;

import javax.persistence.*;

@Entity
@Table(name="Transaction")
public class CTransaction {

	private Customer cust;
	private int qty;
	private double total;
	private String trans_id,prod_name;
	
	@OneToOne(targetEntity=Customer.class,cascade = CascadeType.ALL)
	
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	@Column(name = "qty",length = 5)
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Column(name = "Total",length = 5)
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Id
	@Column(name = "Trans_id",length = 10)
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
	@Column(name = "Prod_name",length = 50)
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	
}
