package org.quivient.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TypeEntity : Class representant un type entity. Mappé avec la base
 * (hibernate).
 */
@Entity
@Table(name = "um_type")
public class TypeEntity {

	@Id
	@Column(name = "t_id")
	private Integer id;

	@Column(name = "t_name")
	private String name;

	@Column(name = "t_image")
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
