package com.techlabs.model;

public class Computer {
	private String name;
	private HardDisk Harddisk;
	
	public Computer() {
	}
	
	public Computer(String name, HardDisk disk) {
		super();
		this.name = name;
		this.Harddisk = disk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HardDisk getDisk() {
		return Harddisk;
	}
	public void setDisk(HardDisk disk) {
		this.Harddisk = disk;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", Harddisk=" + Harddisk + "]";
	}
	
	
}
