package com.ricks.guitars;

import java.util.*;

public class Inventory {

	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, 
			Type type,int numStrings, Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, new GuitarSpec(builder, model, type, numStrings, backWood, topWood));
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber){
		for(Iterator i=guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	
	public List search(GuitarSpec searchSpec){
		System.out.println("searching ...");
		List matchingGuitars = new LinkedList();
		for(Iterator i=guitars.iterator(); i.hasNext();){
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			
			if(guitar.getGuitarSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}
}

