package com.veera.bean;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	private String empId;
	private String empName;
	private String department;
	private String empSal;

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+department);
		System.out.println("Employee Department : "+empSal);
	}
}