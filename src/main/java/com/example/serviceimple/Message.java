package com.example.serviceimple;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.exception.EmailAlreadyExitis;
import com.example.repository.EmployeeRepository;
import com.example.service.Request;

@Service
public class Message implements Request
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) throws EmailAlreadyExitis
	{
		employee.setDate(LocalDate.now());
		Employee employee2=employeeRepository.findByEmail(employee.getEmail());
		{
			if(employee2!=null)
			{
				throw new EmailAlreadyExitis("Email alredy Exitis", HttpStatus.BAD_REQUEST);
			}
		}
		return employeeRepository.save(employee);
	}

}
