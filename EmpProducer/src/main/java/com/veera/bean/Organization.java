package com.veera.bean;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("organization")
public class Organization {
	private String orgId;
	private String orgName;
	private String orgLocation;
	private List<Employee> employees;

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void setOrgLocation(String orgLocation) {
		this.orgLocation = orgLocation;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void displayOrganizationData()
	{
		System.out.println("*******Organization Details Begin*******");
		System.out.println("Organization Id : "+orgId);
		System.out.println("Organization Name : "+orgName);
		System.out.println("Organization Location : "+orgLocation);
		System.out.println("*******Organization Details End*******\n");
		
		System.out.println("*******Employee Details Begin*******");
		for(Employee emp : employees)
		{
			emp.displayEmployee();
		}
		System.out.println("*******Employee Details End*******");
	}
}