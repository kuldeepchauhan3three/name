package com.genpact.leavemanagementdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.leavemanagementdemo.entity.Employee;



@RestController
public class EmployeeController {
	


	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		Employee employee =new Employee(1l, "Genpact", "india", "Software", 8586777l);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee);
		return ResponseEntity.ok(employees);
	}
	
	

}
