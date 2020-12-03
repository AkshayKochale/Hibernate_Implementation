package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class LocalAd {

	private String cname;
	private int sal;

	public LocalAd(String cname, int sal) {
		super();
		this.setCname(cname);
		this.setSal(sal);
	}

	public LocalAd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
