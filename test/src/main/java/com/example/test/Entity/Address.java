package com.example.test.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.NoArgsConstructor;



@Entity
@Transactional
@NoArgsConstructor
@Table(name="address")
public class Address {


	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="add_id")
	private long id;
	private String city;
	private String zipcode;
	
	
	@ManyToOne
	@JoinColumn(name="fk_emp_id")
	private Employee employee;
	
	
	public Address(long id, String city, String zipcode, Employee employee) {
		super();
		this.id = id;
		this.city = city;
		this.zipcode = zipcode;
		this.employee = employee;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}
