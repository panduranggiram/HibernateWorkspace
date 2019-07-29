package com.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="account_plus1")
public class AccountPlus 
{
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int acpid;
	
	private String email;
	
	private int amnt;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acno")
	private Account ac1;
	
	
	
	public Account getAc1() {
		return ac1;
	}

	public void setAc1(Account ac1) {
		this.ac1 = ac1;
	}

	public int getAcpid() {
		return acpid;
	}

	public void setAcpid(int acpid) {
		this.acpid = acpid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAmnt() {
		return amnt;
	}

	public void setAmnt(int amnt) {
		this.amnt = amnt;
	}
	
}
