package com.spring.mysql.api.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.spring.mysql.api.DTO.CarDto;
import com.spring.mysql.api.DTO.CarUDto;
import com.spring.mysql.api.model.Car;

@Component
public class CarConverter {

	public CarDto entityToRDto(Car car) {
		
		CarDto dto=new CarDto();
		dto.setId(car.getId());
		dto.setName(car.getName());
		
		return dto;
		
	}
public List<CarDto> entityToRDto(List<Car> car) {
		
	return car.stream().map(x->entityToRDto(x)).collect(Collectors.toList());
		
	}
	
	public Car RDtoToEntity(CarDto dto) {
		
		Car car=new Car();
		car.setId(dto.getId());
		car.setName(dto.getName());
		return car;
	}
	
	public List<Car> RDtoToEntity(List<CarDto> dto) {
		return dto.stream().map(x->RDtoToEntity(x)).collect(Collectors.toList());
		
	}
	
public CarUDto entityToUDto(Car car) {
		
		CarUDto dto=new CarUDto();
		dto.setId(car.getId());
		dto.setName(car.getName());
		dto.setEndtdate(car.getEndtdate());
		dto.setStartdate(car.getStartdate());
		
		return dto;
		
	}

public Car uDtoToEntity(CarUDto dto) {
	
	Car car=new Car();
	car.setId(dto.getId());
	car.setName(dto.getName());
	car.setEndtdate(dto.getEndtdate());
	car.setStartdate(dto.getStartdate());
	return car;
}
	
	
}
