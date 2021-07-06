package com.poc.cache;

public class Address {

	private String street;
	private int number;
	
	public Address(){}
	
	public Address(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
