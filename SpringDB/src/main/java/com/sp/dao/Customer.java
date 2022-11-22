package com.sp.dao;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private java.math.BigDecimal salary;
	private int deptId;
	private java.sql.Date joinDate;
	private java.sql.Date relieveDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.math.BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(java.math.BigDecimal salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public java.sql.Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(java.sql.Date joinDate) {
		this.joinDate = joinDate;
	}

	public java.sql.Date getRelieveDate() {
		return relieveDate;
	}

	public void setRelieveDate(java.sql.Date relieveDate) {
		this.relieveDate = relieveDate;
	}

}
