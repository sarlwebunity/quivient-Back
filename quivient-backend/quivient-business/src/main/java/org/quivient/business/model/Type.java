package org.quivient.business.model;

import java.io.Serializable;

public class Type implements Serializable {

	private static final long serialVersionUID = -7219867874843874899L;

	private Integer id;
	private String name;
	private String image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
