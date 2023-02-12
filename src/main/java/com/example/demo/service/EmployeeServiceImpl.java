package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;

	private VacationService vacationService;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository, VacationService vacationService) {
		this.employeeRepository = employeeRepository;
		this.vacationService = vacationService;
	}

	@Override
	public List<Employee> getEmployeesWithSalaryLtEqTo(int salary) {
		return employeeRepository.getEmployeesBySalaryLessThanEqual(salary);
	}

	@Override
	public List<Employee> filterEmployeesByNoLastYearVacation(List<Employee> employees) {
		return employees.stream()
						.filter(e -> !vacationService.hadVacLastYear(e.getId()))
				        .collect(Collectors.toList());
	}
}
