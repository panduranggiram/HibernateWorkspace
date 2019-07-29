package com.defaulte;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cjc_Karvenagar {

	@Id
	private String regular_batchNo;

	public String getRegular_batchNo() {
		return regular_batchNo;
	}

	public void setRegular_batchNo(String regular_batchNo) {
		this.regular_batchNo = regular_batchNo;
	}
	
}
