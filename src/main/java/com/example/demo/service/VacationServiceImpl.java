package com.example.demo.service;

import org.springframework.stereotype.Service;


@Service
public class VacationServiceImpl implements VacationService{

	@Override
	public boolean hadVacLastYear(Long empId) {
		return empId % 2 == 0;
	}
}
