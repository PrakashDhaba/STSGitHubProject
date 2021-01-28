package com.pws.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pws.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
