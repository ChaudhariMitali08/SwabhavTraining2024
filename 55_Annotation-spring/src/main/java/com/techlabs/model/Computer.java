package com.techlabs.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	private String name;
	
	private Harddisk Harddisk;

	public Computer() {
	}

	@Autowired
	public Computer(@Value("apple") String name, Harddisk disk) {
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

	public Harddisk getDisk() {
		return Harddisk;
	}

	public void setDisk(Harddisk disk) {
		this.Harddisk = disk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", Harddisk=" + Harddisk + "]";
	}

}
