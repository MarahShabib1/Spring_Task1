package com.spring.mysql.api.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class CarUDto {
	
	private int id;
	private String name;
	public LocalDate startdate;
	public LocalDate endtdate;
	
	public CarUDto() {
		
		
	}
	
	
	public CarUDto(int id, String name, LocalDate startdate, LocalDate endtdate) {
		super();
		this.id = id;
		this.name = name;
		this.startdate = startdate;
		this.endtdate = endtdate;
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
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEndtdate() {
		return endtdate;
	}
	public void setEndtdate(LocalDate endtdate) {
		this.endtdate = endtdate;
	}
	
	

}
