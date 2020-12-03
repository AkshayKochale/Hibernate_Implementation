package com.test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class project {

	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy = "project")
	private List<emp> emp;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<emp> getEmp() {
		return emp;
	}

	public void setEmp(List<emp> emp) {
		this.emp = emp;
	}

}
