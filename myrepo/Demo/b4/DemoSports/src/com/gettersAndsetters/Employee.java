package com.gettersAndsetters;

public class Employee {
	private String name;
	private int id;
	private String nCompany;

	Employee(String name, int id, String nCompany) {
		this.id = id;
		this.name = name;
		this.nCompany = nCompany;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getNCompany() {
		return nCompany;
	}
}
