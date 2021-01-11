package com.spring.mysql.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mysql.api.DTO.CarDto;
import com.spring.mysql.api.DTO.CarUDto;
import com.spring.mysql.api.converter.CarConverter;
import com.spring.mysql.api.model.Car;
import com.spring.mysql.api.model.Customer;
import com.spring.mysql.api.repositories.CarRepository;
import com.spring.mysql.api.repositories.CustomerRepository;

@Service
public class CarService {
	
	 @Autowired
	 private CarRepository carRepository;
	 @Autowired
	 private CustomerRepository customerRepository;
	 @Autowired
		private CarConverter carConverter;
		
	 public List<Car> getAllCars(){
		 List<Car> cars=new ArrayList<>();
		 cars=(List<Car>) carRepository.findAll();
		
		 return  (List<Car>) carRepository.findAll();
	
	 }
	 
		public List<CarDto> addCars(List<Car> newCar) {
			carRepository.saveAll(newCar);
			return carConverter.entityToRDto(newCar);
		}

		
		public CarUDto rentCars(Car newCar ,int Customerid) {
			
			Customer customer= customerRepository.findById(Customerid).get();
			newCar.setCustomer(customer);
			carRepository.save(newCar);
			return carConverter.entityToUDto(newCar);
		}
		
}
