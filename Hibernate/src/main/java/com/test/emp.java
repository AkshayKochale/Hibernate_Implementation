package com.test;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class emp {

	@Id
	private int eid;
	private String name;
	@ManyToMany
	private List<project> project;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<project> getProject() {
		return project;
	}

	public void setProject(List<project> project) {
		this.project = project;
	}

}
