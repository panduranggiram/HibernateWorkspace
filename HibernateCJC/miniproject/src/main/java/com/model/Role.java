package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Individual User & Dealer;
 * This pojo class is used for Role purpose;
 * Role reference is given in Login pojo
 */



@Entity
public class Role 
{	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
	private String roleName;
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
