package com.example.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.Address;
import com.example.test.Repository.AddressRepository;

@RestController

public class AddressController {
	
	@Autowired
	private AddressRepository addrepo;
	
	@GetMapping("/getAddress")
	public List<Address> getEmployees(){
		return addrepo.findAll();
	}
	
	

}
