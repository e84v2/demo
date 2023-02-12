package com.example.demo.web;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

	private SalaryService salaryService;

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(SalaryService salaryService, EmployeeService employeeService) {
		this.salaryService = salaryService;
		this.employeeService = employeeService;
	}

	@GetMapping("/getEmployeesByCondition")
	public List<Employee> get(){
		int thr = salaryService.getMinZP() * 10;
		return employeeService.filterEmployeesByNoLastYearVacation(employeeService.getEmployeesWithSalaryLtEqTo(thr));
	}
}
