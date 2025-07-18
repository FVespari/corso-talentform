package com.oop.classes.intro;

public class Employee {
	
	int stipendio;
	int oreLavorate;
	int retribuzioneOraria;
	
	
	
	public Employee(int stipendio, int oreLavorate, int retribuzioneOraria) {
		super();
		this.stipendio = stipendio;
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	
	
	public int getStipendio() {
		return retribuzioneOraria * oreLavorate;
	}
	
	
	
	public int getOreLavorate() {
		return stipendio / retribuzioneOraria;
	}
	

	
	public int getRetribuzioneOraria() {
		return stipendio / oreLavorate;
	}
	
	
}
