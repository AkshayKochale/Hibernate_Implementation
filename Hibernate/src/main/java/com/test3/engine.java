package com.test3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class engine {

	@Id
	private int id;
	private String name;
	private String Type;
	@OneToOne
	private bike b;
	@OneToOne
	private car c;
	
	
	public car getC() {
		return c;
	}
	public void setC(car c) {
		this.c = c;
	}
	public bike getB() {
		return b;
	}
	public void setB(bike b) {
		this.b = b;
	}
	public int getId() {
		return id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
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
	
}
