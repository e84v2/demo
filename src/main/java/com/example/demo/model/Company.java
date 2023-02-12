package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	private Long id;

	public Long getId() {
		return id;
	}
}
