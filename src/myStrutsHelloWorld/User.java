package myStrutsHelloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javassist.SerialVersionUID;

@Entity
@Table( name="emp_table")
public class User {
	private static final long SerialVersionUID = 48L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name")
	private String username;
	
	@Column(name = "emp_pass")
    private String pass;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
    
    
}
