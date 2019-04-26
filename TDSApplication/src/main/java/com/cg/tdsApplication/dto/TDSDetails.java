package com.cg.tdsApplication.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TDSDetails {
	@Id
	private int id;
	private String deductorName;
	private String deductor_pan;
	private int tdsDeposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductor_pan() {
		return deductor_pan;
	}
	public void setDeductor_pan(String deductor_pan) {
		this.deductor_pan = deductor_pan;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}
	
	
}
