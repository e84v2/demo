package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;


public interface EmployeeService {

	List<Employee> getEmployeesWithSalaryLtEqTo(int salary);

	List<Employee> filterEmployeesByNoLastYearVacation(List<Employee> employees);
}
