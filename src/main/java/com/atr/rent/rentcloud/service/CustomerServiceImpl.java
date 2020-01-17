package com.atr.rent.rentcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atr.rent.rentcloud.repository.CustomerRepository;
import com.atr.rentcloud.rentcloud_comons.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
