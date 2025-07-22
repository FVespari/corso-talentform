package com.oop.classes.intro;

public class ArtigianoDanai extends FreelancerDanai {
	
	private int importoInps;
	private int redditoAnnuoLordoEccedente;
	private int importoEccedente;
	private int aliquotaInpsEccedente;
	
	public ArtigianoDanai(/*int redditoAnnuoLordo,*/ int redditoAnnuoLordoEccedente, int coeffRedd, int aliquotaInps, int aliquotaIrpef, int importoInps, int importoEccedente, int aliquotaInpsEccedente, int redditoAnnuoLordo) {
		super(/*redditoAnnuoLordo,*/ coeffRedd, aliquotaInps, aliquotaIrpef, redditoAnnuoLordo);
		// TODO Auto-generated constructor stub
		this.importoInps = importoInps;
		this.redditoAnnuoLordoEccedente = redditoAnnuoLordoEccedente;
		this.importoEccedente = importoEccedente;
		this.aliquotaInpsEccedente = aliquotaInpsEccedente;
	}	
	

	
	public void utileTasse() {
		System.out.println("Utile Tasse: " + getUtileTasse());
	}
	
	
	
	public void tassaIrpef() {
		System.out.println("Tassa Irpef: " + getTassaIrpef());
	}
	
	
	
	public int getUtileTassaEccedente() {
		return redditoAnnuoLordoEccedente - importoEccedente;
	}
	
	
	
	public int getInpsEccedente() {
		return getUtileTassaEccedente() * aliquotaInpsEccedente / 100;
	}
	
	
	
	public int getStipendioMensileArtigiano() {
		return (redditoAnnuoLordoEccedente - (getTassaIrpef() + getInpsEccedente() + importoInps)) / 12;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
