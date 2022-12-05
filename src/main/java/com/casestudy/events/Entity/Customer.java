package com.casestudy.events.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;
	@NotNull
	private String customeremailid;
	@NotNull
	private String customerpassword;
	@NotNull
	private String customerusername;
	@NotNull
	private long customermobileno;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerid, String customeremailid, String customerpassword, String customerusername,
			long customermobileno) {
		super();
		this.customerid = customerid;
		this.customeremailid = customeremailid;
		this.customerpassword = customerpassword;
		this.customerusername = customerusername;
		this.customermobileno = customermobileno;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomeremailid() {
		return customeremailid;
	}
	public void setCustomeremailid(String customeremailid) {
		this.customeremailid = customeremailid;
	}
	public String getCustomerpassword() {
		return customerpassword;
	}
	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}
	public String getCustomerusername() {
		return customerusername;
	}
	public void setCustomerusername(String customerusername) {
		this.customerusername = customerusername;
	}
	public long getCustomermobileno() {
		return customermobileno;
	}
	public void setCustomermobileno(long customermobileno) {
		this.customermobileno = customermobileno;
	}

}
