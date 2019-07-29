package com.default_inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cjc_karvenagar")
public class CjcKarvenagar extends Cjc
{
	private String fulldaybatchno;

	public String getFulldaybatchno() 
	{
		return fulldaybatchno;
	}

	public void setFulldaybatchno(String fulldaybatchno) 
	{
		this.fulldaybatchno = fulldaybatchno;
	}
}
