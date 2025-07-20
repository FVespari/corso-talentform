package com.oop.classes.intro;

public class MainCommencianteConCostruttore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommencianteConCostruttore cc = new CommencianteConCostruttore(125000, 40, 3500, 24, 15, 15000);
		
		System.out.println("getUtilePerCalcoloTasse: " + cc.getUtilePerCalcoloTasse());
		
		System.out.println("getTassaIrpef: " + cc.getTassaIrpef());

		System.out.println("getAliquotaInps: " + cc.getAliquotaInps());
		
		System.out.println("Stipendio mensile netto: " + cc.getStipendioMensileNetto());

	}

}