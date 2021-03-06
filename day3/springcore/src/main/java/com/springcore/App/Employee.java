package com.springcore.App;

public class Employee {

	private int empId;
	private String empName;
	private String empDep;
	

	public Employee() {
		super();
		System.out.println("Default Constructor !!");
	}

	public Employee(int empId, String empName, String empDep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDep=" + empDep + "]";
	}

}
