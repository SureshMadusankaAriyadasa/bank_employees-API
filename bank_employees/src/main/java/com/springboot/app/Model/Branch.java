package com.springboot.app.Model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="bank_branch")
//@Embeddable
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="branch_id")
	private int branch_id;
	
	@Column(name="branch_name")
	private String branch_name;
	
	@Column(name="branch_address")
	private String branch_address;
	
	@Column(name="bank_id")
	private int bank_id;
	

	public Branch() {
		super();
	}
	
	public Branch(int branch_id, String branch_name, String branch_address, int bank_id) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
		this.bank_id = bank_id;
		
	}
	
	public int getbranch_id() {
		return branch_id;
	}
	public void setbranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	
	public String getbranch_name() {
		return branch_name;
	}
	
	public void setbank_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getbranch_address() {
		return branch_address;
	}
	
	public void setbranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	
	public int getbank_id() {
		return bank_id;
	}
	
	public void setbank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	
	@Override
	public String toString() {
		return "branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ",branch_address="+ branch_address +",bank_id=" + bank_id + "]";
	}

}
