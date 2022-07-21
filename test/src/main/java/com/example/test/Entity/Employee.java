package com.example.test.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="employee")
public class Employee {
	
 @Id
 @GeneratedValue(strategy=GenerationType.TABLE)
 private long id;
 
 @NotBlank(message = "Name cannot be empty")
 @Column(name="first name")
 private String firstname;
 
 @Column(name="last name")
 private String lastname;
 
 @NotBlank(message = "email cannot be empty")
 @Column(name="email")
 private String email;

public Employee(long id, String firstname, String lastname, String email) {
	
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}

@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="id")  
//@OrderColumn(name="type")  
private List<Address> address = new ArrayList<>();  
 

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}
	
	

}
