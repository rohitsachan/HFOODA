package com.ricks.guitars;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public boolean matches(GuitarSpec otherSpec){
		if(builder != otherSpec.builder)
			return false;
		
		if((model!=null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		
		if(type != otherSpec.type)
			return false;
		
		if(backWood != otherSpec.backWood)
			return false;
		if(topWood != otherSpec.topWood)
			return false;
		
		if(numStrings != otherSpec.numStrings)
			return false;
		return true;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}
	
	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}
