package com.aop.api.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aop.api.model.Employee;
import com.aop.api.service.EmployeeService;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Jun 1, 2022
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();

		Employee employee1 = new Employee();
		employee1.setId("1");
		employee1.setName("Aslam");

		employees.add(employee1);

		Employee employee2 = new Employee();
		employee2.setId("2");
		employee2.setName("Zoti");

		employees.add(employee2);
		return employees;
	}
}
