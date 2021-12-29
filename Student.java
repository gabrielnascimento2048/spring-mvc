package com.lovecode.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private String Country;
	
	private String language;
	
	private String [] operatingSystems;
	
	private LinkedHashMap<String,String> options;
	
	public Student() {
	
		//populate country options: used ISO country code
		options = new LinkedHashMap<>();
		
		options.put("BR", "Brazil");
		options.put("PT", "Portugal");
		options.put("FR", "France");
		options.put("IN", "India");
		options.put("USA", "United States");
	}
	
	public LinkedHashMap<String, String> getoptions() {
		return options;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
}
