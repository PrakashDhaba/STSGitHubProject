package com.pws.service;

import java.util.List;

import com.pws.entity.Employee;

public interface EmployeeService {
	
	
	
	public List<Employee> saveEmployees(List<Employee> employees);
   public List<Employee> getEmployees();
   public Employee getEmployeeById(int id);
   public String deleteEmployee(int id);
   public Employee updateEmployee(Employee employee);
}
