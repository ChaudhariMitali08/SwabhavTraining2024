package com.techlabs.model;

public class HardDisk {
	private int capacity;
	
	public HardDisk() {
	}

	public HardDisk( int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}
	
	
}
