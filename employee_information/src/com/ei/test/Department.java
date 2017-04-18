package com.ei.test;

//creating a department class
public class Department {
	private int id;
	private String name;
	private String description;
	
	//default constructor
	public Department() {}
	
	//Parameterized constructor
	public Department(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.description = desc;
	}
	
	public int getId() {
		return id;
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
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
}
