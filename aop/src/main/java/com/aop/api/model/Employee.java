package com.aop.api.model;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Jun 1, 2022
 *
 */
public class Employee {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
