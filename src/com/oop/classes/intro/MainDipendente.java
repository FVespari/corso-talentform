package com.oop.classes.intro;

public class MainDipendente {
	
	int oreLavorate;
	int retribuzioneOraria;
	
	

	public MainDipendente(int oreLavorate, int retribuzioneOraria) {
		super();
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}
	
	

	public int getStipendio() {
		return oreLavorate * retribuzioneOraria;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainDipendente stipendio = new MainDipendente(160, 15);
		
		System.out.println("Stipendio mensile: " + stipendio.getStipendio());
		

	}

}
