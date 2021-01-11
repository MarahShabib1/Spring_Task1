package com.spring.mysql.api.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.spring.mysql.api.DTO.CustomerDto;
import com.spring.mysql.api.model.Customer;

@Component
public class CustomerConverter {

	
	
	public CustomerDto entityToDto(Customer customer) {
		
		CustomerDto dto=new CustomerDto();
		dto.setId(customer.getId());
		dto.setName(customer.getName());
		
		return dto;
		
	}
public List<CustomerDto> entityToDto(List<Customer> customer) {
		
	return customer.stream().map(x->entityToDto(x)).collect(Collectors.toList());
		
	}
	
	public Customer DtoToEntity(CustomerDto dto) {
		
		Customer customer=new Customer();
		customer.setId(dto.getId());
		customer.setName(dto.getName());
		return customer;
	}
	
	public List<Customer> DtoToEntity(List<CustomerDto> dto) {
		return dto.stream().map(x->DtoToEntity(x)).collect(Collectors.toList());
		
	}
}
