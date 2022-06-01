package com.aop.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.api.model.Employee;
import com.aop.api.service.EmployeeService;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Jun 1, 2022
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getEmployees() {
		return ResponseEntity.ok().body(employeeService.getEmployees());
	}
}
