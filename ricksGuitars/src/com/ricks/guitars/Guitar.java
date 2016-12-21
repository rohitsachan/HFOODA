package com.ricks.guitars;

public class Guitar {
	private String serialNumber;
	private double price;
	GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
