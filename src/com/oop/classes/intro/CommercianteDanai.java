package com.oop.classes.intro;

public class CommercianteDanai extends ArtigianoDanai{

	public CommercianteDanai(int coeffRedd, int aliquotaInps, int aliquotaIrpef, int importoInps,
			int redditoAnnuoLordoEccedente, int importoEccedente, int aliquotaInpsEccedente, int redditoAnnuoLordo) {
		super(coeffRedd, aliquotaInps, aliquotaIrpef, importoInps, redditoAnnuoLordoEccedente, importoEccedente,
				aliquotaInpsEccedente, redditoAnnuoLordo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void utileTasse() {
		System.out.println("Utile Tasse: " + getUtileTasse());
	}
	
	
	
	public void tassaIrpef() {
		System.out.println("Tassa Irpef: " + getTassaIrpef());
	}
	
	
	
	public void utileTassaEccedente() {
		System.out.println("Utile Tasse: " + getUtileTasse());
	}
	
	
	
	public void inpsEccedente() {
		System.out.println("Inps Eccedente: " + getInpsEccedente());
	}
	
	
	
	public void stipendioMensileCommerciante() {
		System.out.println("Stipendio Mensile Commerciante: " + getStipendioMensileArtigiano());
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
