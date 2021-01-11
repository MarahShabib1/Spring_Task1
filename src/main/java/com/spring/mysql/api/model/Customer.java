package com.spring.mysql.api.model;

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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	
	@OneToMany(cascade=CascadeType.ALL ,mappedBy="customer")
	List<Car> cars=new ArrayList<>();
	 
//	List<Reservation> reservation=new ArrayList<>();
	
	public Customer() {
		
	}

	public Customer(String name) {
	super();
	this.name = name;
	//this.reservation = reservation;
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

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}






	

	
	
}
