package com.oop.classes.intro;

public class CommencianteConCostruttore {
	
	// MODEL DELLA CLASSE
	
	// ATTRIBUTI
	
	public int redditoAnnuoLordo;
	public int coeffRedd;
	public int importoInps;
	public int aliquotaInps;
	public int aliquotaIrpef;
	public int importoEccedente;
	
	
	
	//COSTRUTTORE
	
	public CommencianteConCostruttore(int redditoAnnuoLordo, int coeffRedd, int importoInps, int aliquotaInps,
			int aliquotaIrpef, int importoEccedente) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.importoInps = importoInps;
		this.aliquotaInps = aliquotaInps;
		this.aliquotaIrpef = aliquotaIrpef;
		this.importoEccedente = importoEccedente;
	}


	
	public int getUtilePerCalcoloTasse() {
		return (redditoAnnuoLordo * coeffRedd) / 100;
	}
	
	public int getTassaIrpef() {
		return (getUtilePerCalcoloTasse() * aliquotaIrpef) / 100;
	}
	
	public int getTassaEccedente() {
		return (redditoAnnuoLordo - importoEccedente) * coeffRedd / 100;
	}
	
	public int getAliquotaInps() {
		return (getTassaEccedente() * aliquotaInps) / 100;
	}
	
	public int getStipendioMensileNetto() {
		return (redditoAnnuoLordo - (getTassaIrpef() + getAliquotaInps() + importoInps)) / 12;
	}
	
	
	
}