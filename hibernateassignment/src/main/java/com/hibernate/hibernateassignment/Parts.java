package com.hibernate.hibernateassignment;

public class Parts {
   
	private String gears;
	private String oil;
	 
	public Parts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parts(String gears, String oil) {
		super();
		this.gears = gears;
		this.oil = oil;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	@Override
	public String toString() {
		return "Parts [gears=" + gears + ", oil=" + oil + "]";
	} 
	
	
	
	
}
