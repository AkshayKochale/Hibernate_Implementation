package com.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_table")
public class Student {

	@Id
	@Column(name = "Sid")
	private int id;
	@Column(name = "Sname")
	private String name;
	private String course;
	@OneToMany(mappedBy = "stu")
	private List<Address> ad;

	public List<Address> getAd() {
		return ad;
	}

	public void setAd(List<Address> ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
