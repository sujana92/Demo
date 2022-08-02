package com.example.test.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.Employee;
import com.example.test.Exception.CustomException;
import com.example.test.Repository.EmployeeRepository;
import com.example.test.Service.EmployeeService;


@RestController
@RequestMapping("/employees")

public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employees) {
		return repo.save(employees);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) throws CustomException{
		Employee employees = repo.findById(id)
				.orElseThrow(() -> new CustomException("employee not exist"+ id));
		return ResponseEntity.ok(employees);
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeesDetails) throws CustomException{
		Employee updateEmployee = repo.findById(id)
				.orElseThrow(() -> new CustomException("employee not exist"+id));
		
		updateEmployee.setFirstname(employeesDetails.getFirstname());
		updateEmployee.setLastname(employeesDetails.getLastname());
		updateEmployee.setEmail(employeesDetails.getEmail());
		
		repo.save(updateEmployee);
		return ResponseEntity.ok(updateEmployee);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id) throws CustomException{
		
		Employee employees = repo.findById(id)
				.orElseThrow(() -> new CustomException("employee not exist"+id));
		
		repo.delete(employees);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	

