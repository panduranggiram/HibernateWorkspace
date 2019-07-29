package com.cjc;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	private String cityname;
	private String area;
	
	
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
