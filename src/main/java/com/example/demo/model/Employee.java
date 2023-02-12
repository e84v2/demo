package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Employee {

	@Id
	private Long id;

	private String name;

	private int salary;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public Company getCompany() {
		return company;
	}
}
