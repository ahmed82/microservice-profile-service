package com.atr.rent.rentcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atr.rentcloud.rentcloud_comons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
