package com.join_table_inheritance;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cjc_akurdi")
//@DiscriminatorValue(value="Akurdi")
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
