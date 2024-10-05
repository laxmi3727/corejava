package com.hibernate.hibernateassignment;

public class Car {
    
	private int carId;
	private String  CarName;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	
	public Car(int carId, String carName) {
		super();
		this.carId = carId;
		CarName = carName;
	}


	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", CarName=" + CarName + "]";
	}	
	
}
