package com.core;

import java.math.BigDecimal;

//import java.math.BigDecimal;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class City {

	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	public City(int id, String name, String countryCode, String district,
			int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	
	
	
	
	
	
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getLastName() {
//		return getName();
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setLastName(String name) {
//		setName(name);
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	
//
//	public String getCountryCode() {
//		return countryCode;
//	}
//
//	public void setFirstName(String name) {
//		setCountryCode(name);
//	}
//
//	public void setCountryCode(String name) {
//		this.countryCode = name;
//	}
//
//	public String get() {
//		return getDistrict();
//	}
//
//	public String getDistrict() {
//		return district;
//	}
//
//	
//
//	public void setDistrict(String email) {
//		this.district = email;
//	}
//
//	
//	public int getPopulation() {
//		return population;
//	}
//
//	public void setSalary(int population) {
//		this.population = population;
//	}

	public void setId(int id) {
		this.id = id;
	}








	public void setName(String name) {
		this.name = name;
	}








	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}








	public void setDistrict(String district) {
		this.district = district;
	}








	public void setPopulation(int population) {
		this.population = population;
	}








	public int getId() {
		return id;
	}








	public String getName() {
		return name;
	}








	public String getCountryCode() {
		return countryCode;
	}








	public String getDistrict() {
		return district;
	}








	public int getPopulation() {
		return population;
	}








	@Override
	public String toString() {
		return String
				.format("City [id=%s, name=%s, countryCode=%s, district=%s, population=%s]",
						id, name, countryCode, district, population);
	}
	
	
		
}
