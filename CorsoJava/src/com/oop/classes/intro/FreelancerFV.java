package com.oop.classes.intro;

public class FreelancerFV {
	
	// MODEL DELLA CLASSE
	
	// ATTRIBUTI
	public int redditoAnnuoLordo;
	public int coeffRedditività;
	public int aliquotaInps;
	public int aliquotaIrpef;
	
	
	
//	public int getRedditoAnnuoLordo() {
//		return redditoAnnuoLordo;
//	}
	
	
	
	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}
	
	
	
//	public int getCoeffRedditività() {
//		return coeffRedditività;
//	}
	
	
	
	public void setCoeffRedditività(int coeffRedditività) {
		this.coeffRedditività = coeffRedditività;
	}
	
	
	
//	public int getAliquotaInps() {
//		return aliquotaInps;
//	}
	
	
	
	public void setAliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}
	
	
	
//	public int getAliquotaIrpef() {
//		return aliquotaIrpef;
//	}
	
	
	
	public void setAliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}
	
	
	
	public int getUtilePerCalcoloTasse() {
		return redditoAnnuoLordo * coeffRedditività / 100;
	}
	
	
	
	public int getTassaInps() {
		return getUtilePerCalcoloTasse() * aliquotaInps / 100;
	}
	
	
	
	public int getTassaIrpef() {
		return getUtilePerCalcoloTasse() * aliquotaIrpef / 100;
	}
	

	
	public int getStipendioMensileNetto() {
		return (redditoAnnuoLordo - (getTassaInps() + getTassaIrpef())) / 12;
	}
	
	

}