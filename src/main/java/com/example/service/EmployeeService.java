package com.example.service;

import java.util.List;

import com.example.entity.Employee;
import com.example.exception.Response;

public interface EmployeeService 
{

	 Employee saveEmployee(Employee employee);
		
		List<Employee> findAllByOrderByIdAsc();
		
		List<Employee> getAllEmployee();
		
		List<Employee> getAllEmployeeByOrderByIdDesc();
		
		Employee updateById(Employee employee , int id);
		
		Response  deleteById(int id) ;
}
