package com.test2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Classroom")
public class classroom {
	@Id
	private long n;
	private String className;
	private String classTeacher;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
	}


	@Override
	public String toString() {
		return "classroom [n=" + n + ", className=" + className + ", classTeacher=" + classTeacher + "]";
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

}
