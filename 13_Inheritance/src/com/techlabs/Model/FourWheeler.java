package com.techlabs.Model;

public class FourWheeler extends Vehicle {
	private int mileage;

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "FourWheeler [mileage=" + mileage + ", getMileage()=" + getMileage() + "]";
	}
	
	
}
