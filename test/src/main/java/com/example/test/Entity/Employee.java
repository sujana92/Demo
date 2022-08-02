package com.example.test.Entity;

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
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;

import lombok.NoArgsConstructor;

@Entity
@Transactional
@NoArgsConstructor
@Table(name="employees")
public class Employee {
	
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 
 @Column(name="emp_id")
 private long id;
 
 @NotBlank(message = "Name cannot be empty")
 @Column(name="first_name")
 private String firstname;
 
 
 @Column(name="last_name")
 private String lastname;
 
 
 @NotBlank(message = "email cannot be empty")
 @Column(name="email")
 private String email;
 
 
 
 @OneToMany(cascade=CascadeType.ALL)
 @JoinColumn(name="fk_emp_id" , referencedColumnName="emp_id")
 private List<Address>  address;

 
public Employee(long id, String firstname, String lastname, String email) {
	
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}

 

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
