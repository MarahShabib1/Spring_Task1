package com.spring.mysql.api.controller;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.PostLoad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.api.DTO.CarDto;
import com.spring.mysql.api.DTO.CarUDto;
import com.spring.mysql.api.DTO.CustomerDto;
import com.spring.mysql.api.converter.CarConverter;
import com.spring.mysql.api.converter.CustomerConverter;
import com.spring.mysql.api.model.Car;
import com.spring.mysql.api.model.Customer;
import com.spring.mysql.api.repositories.CarRepository;
import com.spring.mysql.api.repositories.CustomerRepository;
import com.spring.mysql.api.services.CarService;
import com.spring.mysql.api.services.CustomerService;

@RestController

@RequestMapping("/CarRental")
public class RentController {


	@Autowired
	private CarService carService;
	@Autowired
	private CarConverter carConverter;
	@Autowired
	private CustomerConverter customerConverter;
	@Autowired
	private CustomerService customerService;
	

	@GetMapping("/AllCars")
	public List<CarDto> getAllCars() {
		
		return carConverter.entityToRDto(carService.getAllCars()) ;	
	}
	
	
	@PutMapping("/rent/{Customerid}/{Carid}")
	public CarUDto rentCar(@RequestBody CarUDto car ,@PathVariable int Customerid,@Validated   @PathVariable int Carid) {
		
		return carService.rentCars(carConverter.uDtoToEntity(car),Customerid);

	}
	

	
	@PostMapping("/customer")
	public List<CustomerDto> addCustomer(@RequestBody List<CustomerDto> newCustomer) {
		
		return customerService.addCustomers(customerConverter.DtoToEntity(newCustomer));
	}
	
	@PostMapping("/car")
	public List<CarDto> addCar(@RequestBody List<CarDto> newCar) {
		
		return carService.addCars(carConverter.RDtoToEntity(newCar));
		
	}
	

	@GetMapping("/getCustomers")
	public List<CustomerDto> getAllCustomers(){
		return customerConverter.entityToDto(customerService.getAllCustomers());
	}
	
}
