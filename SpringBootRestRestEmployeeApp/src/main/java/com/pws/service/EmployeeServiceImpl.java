package com.pws.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;

import com.pws.entity.Employee;
import com.pws.repo.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);

	}

	@Override
	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return repository.findById(id).orElse(null);
	}

	@Override
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Employee Remove" + id;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		Employee existingEmployee = repository.findById(employee.getEmp_Id()).orElse(null);
		existingEmployee.setEmp_Fname(employee.getEmp_Fname());
		existingEmployee.setEmp_Lname(employee.getEmp_Lname());
		existingEmployee.setEmailId(employee.getEmailId());
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setGender(employee.getGender());
		existingEmployee.setAddress(employee.getAddress());
		return repository.save(existingEmployee);
	}

}
