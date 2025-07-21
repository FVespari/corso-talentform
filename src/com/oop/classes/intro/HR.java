package com.oop.classes.intro;

public class HR {
	
	public int redditoAnnuoLordo;
	public int coeffRedd;
	public int aliquotaInps;
	public int aliquotaIrpef;

	
	
	public HR(int redditoAnnuoLordo, int coeffRedd, int aliquotaInps, int aliquotaIrpef) {
		super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.aliquotaInps = aliquotaInps;
		this.aliquotaIrpef = aliquotaIrpef;
	}
	
	
	
	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}
	
	
	
	public int getTassaInps() {
		return getUtileTasse() * aliquotaInps / 100;
	}
	
	
	
	public int getTassaIrpef() {
		return getUtileTasse() * aliquotaIrpef / 100;
	}
	
	
	
	public int getStipendioMensile() {
		return (redditoAnnuoLordo - (getTassaInps() + getTassaIrpef())) / 12;
	}
	
	
	
	public int getRedditoAnnuoLordo() {
		return redditoAnnuoLordo;
	}
	
	
	
	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}
	
	
	
	public int getCoeffRedd() {
		return coeffRedd;
	}
	
	
	
	public void setCoeffRedd(int coeffRedd) {
		this.coeffRedd = coeffRedd;
	}
	
	
	
	public int getAliquotaInps() {
		return aliquotaInps;
	}
	
	
	
	public void setAliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}
	
	
	
	public int getAliquotaIrpef() {
		return aliquotaIrpef;
	}
	
	
	
	public void setAliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
