package com.pws.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "EmployeeTb")
public class Employee {
	
	@Id
	@GeneratedValue
	private int emp_Id;
	private String emp_Fname;
	private String emp_Lname;
	private String emailId;
	private int age;
	private String gender;
	private String address;

}
