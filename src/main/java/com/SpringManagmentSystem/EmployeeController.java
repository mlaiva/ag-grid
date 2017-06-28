package com.SpringManagmentSystem;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeRepository employeeRepository;
	
	public EmployeeController(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}

	
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		List<Employee> employee = this.employeeRepository.findAll();
		return employee;
	}
	
	@PutMapping
	public void insert(@RequestBody Employee employee){
	this.employeeRepository.insert(employee);
	}
	
	@PostMapping
	public void update(@RequestBody Employee employee){
		this.employeeRepository.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id){
		this.employeeRepository.delete(id);
		}	
}




