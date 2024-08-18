package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.model.Computer;
import com.techlabs.model.HardDisk;

public class ComputerTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
//		HardDisk harddisk = (HardDisk)context.getBean("harddisk","HardDisk.class");
//		System.out.println(harddisk);
		
		Computer computer =(Computer)context.getBean("computer","Computer.class");
		System.out.println(computer);
	}
}
