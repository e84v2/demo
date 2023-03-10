package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class SalaryServiceImpl implements SalaryService{

	@Value("${min.zp}")
	private int minZP;

	@Override
	public int getMinZP() {
		return minZP;
	}
}
