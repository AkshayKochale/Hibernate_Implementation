package com.test3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class car {

	@Id
	private int id;
	private int eid;
	private String ename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
