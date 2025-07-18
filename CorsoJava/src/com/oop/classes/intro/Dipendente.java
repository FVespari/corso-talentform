package com.oop.classes.intro;

public class Dipendente {
	
	int oreLavorate;
	int retribuzioneOraria;
	
	

	public Dipendente(int oreLavorate, int retribuzioneOraria) {
		super();
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	

	public int getStipendio() {
		return oreLavorate * retribuzioneOraria;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dipendente stipendio = new Dipendente(160, 15);
		
		System.out.println("Stipendio mensile: " + stipendio.getStipendio());
		

	}

}
