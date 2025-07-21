package com.oop.classes.intro;

public class MobileDeveloper extends HR{
	
	String technology;

	public MobileDeveloper(int redditoAnnuoLordo, int coeffRedd, int aliquotaInps, int aliquotaIrpef, String technology) {
		super(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef);
		// TODO Auto-generated constructor stub
		this.technology = technology;
	}

	
	
	@Override
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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
