package com.employee.management.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	@Id
	@Column(name="emp_Id")
	private int empId;
	@Column(name="emp_Name")
	private String empName;
	@Column(name="designation")
	private String designation;
	@Column(name="salary")
	private double empSalary;
}
