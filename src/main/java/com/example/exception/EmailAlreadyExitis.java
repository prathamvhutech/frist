package com.example.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.example.entity.Employee;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

public class EmailAlreadyExitis extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private HttpStatus status;
	
	

	public EmailAlreadyExitis(String message ,HttpStatus conflict) 
	{
		super(message);
		this.status = conflict;
	}

	public HttpStatus getStatus() {
		return status;
	}
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee EmailAlready(Employee employee) throws EmailAlreadyExitis
	{
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
