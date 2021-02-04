package com.springboot.app.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="employee")
//@SecondaryTable(name = "branch",pkJoinColumns = @PrimaryKeyJoinColumn(name = "branch_id",referencedColumnName = "branch_id"))
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="emp_name")
	private String emp_name;
	
	@Column(name="emp_email")
	private String emp_email;
	
	@Column(name="emp_photo")
	private String emp_photo;
	
	@Column(name="emp_address")
	private String emp_address;
	
	@Column(name="emp_password")
	private String emp_password;
	
	@Column(name="branch_id")
	private int branch_id;
	

	

	public Employee() {
		super();
	}
	
	public Employee(int emp_id, String emp_name, String emp_email, String emp_photo, String emp_address, String emp_password, int branch_id) {
		super(); 
		this.emp_id= emp_id;
		this.emp_name = emp_name;
		this.emp_email = emp_email;
		this.emp_photo = emp_photo;
		this.emp_address=emp_address;
		this.emp_password=emp_password;
		this.branch_id=branch_id;
	}
	
	public int getemp_id() {
		return emp_id;
	}
	public void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getemp_name() {
		return emp_name;
	}
	
	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public String getemp_email() {
		return emp_email;
	}
	
	public void setemp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	
	public String getemp_photo() {
		return emp_photo;
	}
	
	public void setemp_photo(String emp_photo) {
		this.emp_photo = emp_photo;
	}
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
//    List < Branch > branch = new ArrayList < > ();
//    
//    public List < Branch > getbranch() {
//        return branch;
//    }
//
//    public void setbranch(List < Branch > branch) {
//        this.branch = branch;
//    }
    
//	@Column(table="branch", name="branch_id")
//	private int branch__id;
	
//	@Column(name="branch_name",table="branch")
//	private String branch_name;
//	public String getbranch_name() {
//		return branch_name;
//	}
//	
//	public void setbranch_name(String branch_name) {
//		this.branch_name = branch_name;
//	}
//	
	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ",emp_email="+ emp_email +",emp_photo=" + emp_photo + "]";
	}

}



