package com.oop.abstracts.classes;

public class MainSoftwareHouse extends Professionista{
	
	public MainSoftwareHouse(int giornateLavoro, int compensoAlGiorno) {
		super(giornateLavoro, compensoAlGiorno);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int totalePreventivo = 0;
		
		Professionista analistaFunzionale = new Professionista(20, 200);
		System.out.println("analistaFunzionale costa: " + analistaFunzionale.getTotaleProfessionista());
		totalePreventivo += analistaFunzionale.getTotaleProfessionista();
		
		Professionista graficoUxUi = new Professionista(15, 150);
		System.out.println("graficoUxUi costa: " + graficoUxUi.getTotaleProfessionista());
		totalePreventivo += graficoUxUi.getTotaleProfessionista();
		
		Professionista sviluppatoreMobile = new Professionista(90, 250);
		System.out.println("sviluppatoreMobile costa: " + sviluppatoreMobile.getTotaleProfessionista());
		totalePreventivo += sviluppatoreMobile.getTotaleProfessionista();
		
		Professionista sviluppatoreFe = new Professionista(90, 250);
		System.out.println("sviluppatoreFe costa: " + sviluppatoreFe.getTotaleProfessionista());
		totalePreventivo += sviluppatoreFe.getTotaleProfessionista();
		
		Professionista sviluppatoreBe = new Professionista(90, 250);
		System.out.println("sviluppatoreBe costa: " + sviluppatoreBe.getTotaleProfessionista());
		totalePreventivo += sviluppatoreBe.getTotaleProfessionista();
		
		Professionista devOps = new Professionista(30, 300);
		System.out.println("devOps costa: " + devOps.getTotaleProfessionista());
		totalePreventivo += devOps.getTotaleProfessionista();
		
		Professionista dba = new Professionista(30, 350);
		System.out.println("dba costa: " + dba.getTotaleProfessionista());
		totalePreventivo += dba.getTotaleProfessionista();
		
		Professionista pm = new Professionista(90, 500);
		System.out.println("pm costa: " + pm.getTotaleProfessionista());
		totalePreventivo += pm.getTotaleProfessionista();
		
		Professionista pmo = new Professionista(90, 250);
		System.out.println("pmo costa: " + pmo.getTotaleProfessionista());
		totalePreventivo += pmo.getTotaleProfessionista();
		
		Professionista capo = new Professionista(90, 1000);
		System.out.println("capo costa: " + capo.getTotaleProfessionista());
		totalePreventivo += capo.getTotaleProfessionista();
		
		System.out.println("IL TOTALE DEL PREVENTIVO È: " + totalePreventivo);
		
	}

}