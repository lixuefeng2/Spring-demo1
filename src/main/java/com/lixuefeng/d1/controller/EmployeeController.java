package com.lixuefeng.d1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.lixuefeng.d1.model.Employee;

public class EmployeeController {

	@RequestMapping("") 
	public List<Employee> getEmployees() {
		List<Employee> ret = new ArrayList<>();
		
		Employee e = new Employee(1, "a", "b", "c");
		ret.add(e);
		return ret;
	}
}
