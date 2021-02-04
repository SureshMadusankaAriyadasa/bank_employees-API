package com.springboot.app.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bank_id")
	private int bank_id;
	
	@Column(name="bank_name")
	private String bank_name;
	
	public Bank() {
		super();
	}
	
	public Bank(int bank_id, String bank_name) {
		super();
		this.bank_id = bank_id;
		this.bank_name = bank_name;
	}
	
	public int getbank_id() {
		return bank_id;
	}
	public void setbank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	
	public String getbank_name() {
		return bank_name;
	}
	
	public void setbank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	@Override
	public String toString() {
		return "bank [bank_id=" + bank_id + ", bank_name=" + bank_name + "]";
	}
}
