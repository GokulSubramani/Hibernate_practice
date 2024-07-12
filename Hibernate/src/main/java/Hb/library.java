package Hb;

import javax.persistence.*;

@Entity
@Table(name="library")
public class library {
	private String lib_id,lib_name;
	private int total_books;
	
	@Id
	@Column(name="lib_Id")
	public String getLib_id() {
		return lib_id;
	}
	public void setLib_id(String lib_id) {
		this.lib_id = lib_id;
	}
	@Column (name="Lib_name")
	public String getLib_name() {
		return lib_name;
	}
	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	@Column(name="Books")
	public int getTotal_books() {
		return total_books;
	}
	public void setTotal_books(int total_books) {
		this.total_books = total_books;
	}
	
	
}
