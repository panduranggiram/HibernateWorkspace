package com.defaulte;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CjcAkurdi {

	@Id
	private String weekend_batchNo;

	public String getWeekend_batchNo() {
		return weekend_batchNo;
	}

	public void setWeekend_batchNo(String weekend_batchNo) {
		this.weekend_batchNo = weekend_batchNo;
	}
	
	
	
}
