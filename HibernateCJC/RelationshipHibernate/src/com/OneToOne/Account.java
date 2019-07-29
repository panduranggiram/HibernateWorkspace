package com.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account1")
public class Account 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="accno")
	private int accno;
	
	@Column(name="first_name")
	private String fname;
	
	@Column(name="last_name")
	private String lname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acpid")
	private AccountPlus acp;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public AccountPlus getAcp() {
		return acp;
	}

	public void setAcp(AccountPlus acp) {
		this.acp = acp;
	}
	
	
}
