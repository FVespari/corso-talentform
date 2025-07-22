package com.oop.classes.intro;

public class FreelancerDanai {

	private int redditoAnnuoLordo;
	private int coeffRedd;
	private int aliquotaInps;
	private int aliquotaIrpef;
	
	
	
	public FreelancerDanai(int redditoAnnuoLordo, int coeffRedd, int aliquotaInps, int aliquotaIrpef) {
		//super();
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.aliquotaInps = aliquotaInps;
		this.aliquotaIrpef = aliquotaIrpef;
	}



	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}



//	public int getCoeffRedd() {
//		return coeffRedd;
//	}



	public int getTassaInps() {
		return getUtileTasse() * aliquotaInps / 100;
	}



	public int getTassaIrpef() {
		return getUtileTasse() * aliquotaIrpef / 100;
	}

	
	
	public int getStipendioMensile() {
		return (redditoAnnuoLordo - (getTassaInps() + getTassaIrpef())) / 12;
	}
	
	


//	public int getAliquotaInps() {
//		return aliquotaInps;
//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
