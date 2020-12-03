package com.test3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Weapon")
public class weapon {

	
	@Id
	@Column(name = "Weapon_id")
	private int id;
	@Column(name = "Weapon_name")
	private String name;

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

	@Override
	public String toString() {
		return "weapon [id=" + id + ", name=" + name + "]";
	}

}
