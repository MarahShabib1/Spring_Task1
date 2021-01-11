package com.spring.mysql.api.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Car")

public class Car {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate startdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public LocalDate endtdate;
	
	@ManyToOne()
	public Customer customer;
	
	
	public Car() {
		
	}
	


	public Car(String name, LocalDate startdate, LocalDate endtdate) {
		super();
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



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
















	




	
}