package com.veera.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.veera.bean.Employee;
import com.veera.bean.Organization;

@RestController
@RequestMapping(value="/producerwithms")
public class EmployeeProducerController {
	@Autowired
	private Organization organization;
	@Autowired
	private Employee employee;
	
	@RequestMapping(value="/getservice", method=RequestMethod.GET)
	public String getService()
	{
		return "Hello Get Method";
	}
	
	@RequestMapping(value="/org", method=RequestMethod.GET)
	public Organization getOrgDetails()
	{
		employee.setEmpId("123");
		employee.setEmpName("Veera");
		employee.setEmpSal("1000");
		employee.setDepartment("IT");
		
		organization.setOrgId("ORG1");
		organization.setOrgLocation("Bangalore");
		organization.setOrgName("MindMajix");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		organization.setEmployees(employees);
		return organization;
	}
}