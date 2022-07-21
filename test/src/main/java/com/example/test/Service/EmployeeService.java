package com.example.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.Employee;
import com.example.test.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
		return repo.findAll();
	}
	
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	public Employee get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	

}
