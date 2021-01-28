package com.pws.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pws.entity.Employee;
import com.pws.service.EmployeeService;

@RestController
public class EmployeeController {

	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService service;

	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		logger.debug("-----Method Execution Started----");

		List<Employee> addemp = service.saveEmployees(employees);
		logger.info("---Employee Add sucessfully---");
		logger.debug("-----Method Execution Ended----");

		return addemp;
	}

	@GetMapping("/Employees")
	public List<Employee> findAllEmployees() {
		logger.debug("--Method Execution Started---");
		List<Employee> findEmp = service.getEmployees();
		logger.info("Fetch All the Employee Sucessfully");
		logger.debug("---Method Execution Ended---");
		return findEmp;
	}

	@GetMapping("/Employee/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		logger.debug("--Method Execution Started---");
		Employee fetchEmpById = service.getEmployeeById(id);
		logger.info("Fetch   EmployeeBy Id  Sucessfully");
		logger.debug("---Method Execution Ended---");

		return fetchEmpById;
	}

	@DeleteMapping("/Employee/{id}")
	public String RemoveEmployee(@PathVariable int id) {

		logger.debug("--Method Execution Started---");
		String removeEmp = service.deleteEmployee(id);
		logger.info("Delete  Employee  Sucessfully");
		logger.debug("---Method Execution Ended---");

		return removeEmp;
	}

	@PutMapping("/Employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		logger.debug("--Method Execution Started---");
		Employee editEmp = service.updateEmployee(employee);
		logger.info("Edit  Employee  Sucessfully");
		logger.debug("---Method Execution Ended---");

		return editEmp;
	}

}
