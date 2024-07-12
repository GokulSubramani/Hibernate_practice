package Hb;

import javax.persistence.*;

@Entity
@Table(name="Subject")
public class Subject {
	private String sub_id,sub_name,category;

	@Id
	@Column(name="subid",length = 30)
	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	
	@Column(name = "Sub_name",length = 50)
	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	@Column(name = "Category",length = 100)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
