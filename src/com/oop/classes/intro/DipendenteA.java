package com.oop.classes.intro;

public class DipendenteA extends DipendenteAndrea {

	private int malattia = 0;
	
	public DipendenteA(String matricola, float stipendio, float straordinario) {
		super(matricola, stipendio, straordinario);
		// TODO Auto-generated constructor stub
	}

	
	
	public void prendiMalattia(int giorniMalattia) {
		malattia += giorniMalattia;
		//malattia = malattia + giorniMalattia;
	}
	
	
	
	@Override
	public double paga(float stipendio) {
		double p = super.paga(straordinario);
		if(malattia == 0) {
			return p;
		}
		return p - malattia * 15.0;
	}
	
	

	public void stampaMalattia() {
		System.out.println(malattia);
	}
	
	public static void main(String[] args) {
		
	}

}
