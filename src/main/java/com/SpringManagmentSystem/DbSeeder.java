package com.SpringManagmentSystem;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{
	private EmployeeRepository employeeRepository;
	
	public DbSeeder(EmployeeRepository employeeRepository){
		this.employeeRepository=employeeRepository;
	}
	
	public void run(String... strings) throws Exception{	
		Employee Balajee = new Employee(
				"Work on SpringBoot",
				"Bala",
				"SR",
				"11/11/16",
				"05/20/17",
				"IN Progress"
						);
		
		//drop all employee
		this.employeeRepository.deleteAll();
		
		//add our employee to the database
		List<Employee> hotels = Arrays.asList(Balajee);
		this.employeeRepository.save(hotels);
	
	}
	
	
}
