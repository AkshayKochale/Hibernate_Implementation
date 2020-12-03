package com.test2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_info")
public class Student {

	@Id
	@Column(name = "Student_id")
	private int id;
	@Column(name = "Student_name")
	private String name;
	@Column(name = "Student_rank")
	private int rank;
	@OneToMany
	private List<classroom> croom;

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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<classroom> getCroom() {
		return croom;
	}

	public void setCroom(List<classroom> croom) {
		this.croom = croom;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", croom=" + croom + "]";
	}


}
