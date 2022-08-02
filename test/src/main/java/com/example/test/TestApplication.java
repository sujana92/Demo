package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.Entity.Employee;
import com.example.test.Repository.EmployeeRepository;

@SpringBootApplication

public class TestApplication  implements CommandLineRunner{

	public static void main(String[] args) {		
		SpringApplication.run(TestApplication.class, args);
					
	}
		@Autowired
		private EmployeeRepository repo;
		
		
		@Override
		public void run(String... args) throws Exception {
			
			
		}
		
		

}
