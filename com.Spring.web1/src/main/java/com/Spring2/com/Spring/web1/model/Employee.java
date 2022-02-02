package com.Spring2.com.Spring.web1.model;






public class Employee {
	
	private Long id;
	private String name;
	private Long salary;
	
	public Employee() {}
	
	public Employee(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
}