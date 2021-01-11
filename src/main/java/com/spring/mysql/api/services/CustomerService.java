package com.spring.mysql.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.mysql.api.DTO.CustomerDto;
import com.spring.mysql.api.converter.CustomerConverter;
import com.spring.mysql.api.model.Car;
import com.spring.mysql.api.model.Customer;
import com.spring.mysql.api.repositories.CustomerRepository;

@Service
public class CustomerService {


	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerConverter customerConverter;
	
	
	public List<CustomerDto> addCustomers(List<Customer> newCustomer) {
		
		
		customerRepository.saveAll(newCustomer);
		
		return customerConverter.entityToDto(newCustomer);
	}
	
 public List<Customer> getAllCustomers(){
		 
		 return  (List<Customer>) customerRepository.findAll();
 }
	
	
}
