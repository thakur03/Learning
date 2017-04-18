package com.ei.test;

import java.sql.Date;
import java.util.Comparator;
// creating a employee class
public class Employee {
	private int id;
	private String name;
	private String address;
	private String salary;
	private Date dob;
	private Department department;
	
	//default constructor
	public Employee() {}

	//Parameterized constructor
	public Employee(int id, String name, String address, String salary, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dob = dob;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	 public static Comparator<Employee> COMPARE_BY_NAME = new Comparator<Employee>() {
	        public int compare(Employee one, Employee other) {
	            return one.name.compareTo(other.name);
	        }
	 };
}
