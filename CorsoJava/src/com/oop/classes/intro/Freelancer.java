package com.oop.classes.intro;

public class Freelancer {
	
	// MODEL DELLA CLASSE
	
	// ATTRIBUTI
	
	int redditoAnnuoLordo;
	int coeffRedd;
	int tassaInps;
	int tassaIrpef;
	
	
	
	public Freelancer(int redditoAnnuoLordo, int coeffRedd, int tassaInps, int tassaIrpef) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.tassaInps = tassaInps;
		this.tassaIrpef = tassaIrpef;
	}
	
	
	
	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}
	
	
	
	public int getTassaInps() {
		return getUtileTasse() * tassaInps / 100;
	}
	
	
	
	public int getTassaIrpef() {
		return getUtileTasse() * tassaIrpef / 100;
	}
	
	
	
	public int getRedditoAnnuoNetto() {
		return redditoAnnuoLordo - (getTassaInps() + getTassaIrpef());
	}
	
}
