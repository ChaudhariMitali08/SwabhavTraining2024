package com.aurionpro.violation.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Labour Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Labour Stopped Working");
		
	}

	@Override
	public void eat() {
		System.out.println("Labour is Eating");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour is Drinking");
		
	}

}
