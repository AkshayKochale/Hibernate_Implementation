package com.test3;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "Aliens")
public class aliens {

	@Id
	private int aid;
	private String aname;
	@OneToMany
	private List<weapon> weapon1;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public List<weapon> getWeapon1() {
		return weapon1;
	}

	public void setWeapon1(List<weapon> weapon1) {
		this.weapon1 = weapon1;
	}

	@Override
	public String toString() {
		return "aliens [aid=" + aid + ", aname=" + aname + ", weapon1=" + weapon1 + "]";
	}

	
	
}
