package com.example.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Long>{

}
