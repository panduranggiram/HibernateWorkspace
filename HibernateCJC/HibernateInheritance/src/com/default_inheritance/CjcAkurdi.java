package com.default_inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cjc_akurdi")
public class CjcAkurdi extends Cjc
{

	
	
	private String weekendbatchno;

	public String getWeekendbatchno()
	{
		return weekendbatchno;
	}

	public void setWeekendbatchno(String weekendbatchno) 
	{
		this.weekendbatchno = weekendbatchno;
	}
	
}
