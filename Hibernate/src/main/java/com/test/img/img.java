package com.test.img;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class img {

	@Id
	private int id;
	@Lob
	private byte[] image;

	@Override
	public String toString() {
		return "img [id=" + id + ", image=" + Arrays.toString(image) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
