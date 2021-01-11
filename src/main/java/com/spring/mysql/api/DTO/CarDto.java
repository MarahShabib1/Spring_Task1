package com.spring.mysql.api.DTO;

import lombok.Data;

@Data
public class CarDto {

	private int id;
	private String name;
	
	public CarDto() {
		
	}
	
	public CarDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
