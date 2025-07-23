package com.oop.abstracts.classes;

public class MainPreventivoSoftwareHouseBis extends SoftwareHouseBis{

	private int tariffaGiornaliera;
	private int giornateLavorate;
	
	public void setTariffaGiornaliera(int tariffaGiornaliera) {
		this.tariffaGiornaliera = tariffaGiornaliera;
	}

	public void setGiornateLavorate(int giornateLavorate) {
		this.giornateLavorate = giornateLavorate;
	}
	
//	public int getTotalePreventivo() {
//		return getPrezzoAnalistaFunzionale() + getPrezzoGraficoUxUi() + getPrezzoSviluppatoreMobile() + getPrezzoSviluppatoreFe() + getPrezzoSviluppatoreBe() + getPrezzoDevOps() + getPrezzoDba();
//	}
	
	@Override
	public int getPrezzoAnalistaFunzionale() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoGraficoUxUi() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoSviluppatoreMobile() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoSviluppatoreFe() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoSviluppatoreBe() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoDevOps() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	@Override
	public int getPrezzoDba() {
		// TODO Auto-generated method stub
		return tariffaGiornaliera * giornateLavorate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainPreventivoSoftwareHouseBis analistaFunzionale = new MainPreventivoSoftwareHouseBis();
		analistaFunzionale.setGiornateLavorate(20);
		analistaFunzionale.setTariffaGiornaliera(200);
		System.out.println("costo analistaFunzionale: " + analistaFunzionale.getPrezzoAnalistaFunzionale());
		
		MainPreventivoSoftwareHouseBis graficoUxUi = new MainPreventivoSoftwareHouseBis();
		graficoUxUi.setGiornateLavorate(15);
		graficoUxUi.setTariffaGiornaliera(150);
		System.out.println("costo graficoUxUi: " + graficoUxUi.getPrezzoGraficoUxUi());
		
		MainPreventivoSoftwareHouseBis sviluppatoreMobile = new MainPreventivoSoftwareHouseBis();
		sviluppatoreMobile.setGiornateLavorate(90);
		sviluppatoreMobile.setTariffaGiornaliera(250);
		System.out.println("costo sviluppatoreMobile: " + sviluppatoreMobile.getPrezzoSviluppatoreMobile());
		
		MainPreventivoSoftwareHouseBis sviluppatoreFe = new MainPreventivoSoftwareHouseBis();
		sviluppatoreFe.setGiornateLavorate(90);
		sviluppatoreFe.setTariffaGiornaliera(250);
		System.out.println("costo sviluppatoreFe: " + sviluppatoreFe.getPrezzoSviluppatoreFe());
		
		MainPreventivoSoftwareHouseBis sviluppatoreBe = new MainPreventivoSoftwareHouseBis();
		sviluppatoreBe.setGiornateLavorate(30);
		sviluppatoreBe.setTariffaGiornaliera(250);
		System.out.println("costo sviluppatoreBe: " + sviluppatoreFe.getPrezzoSviluppatoreBe());
		
		MainPreventivoSoftwareHouseBis devOps = new MainPreventivoSoftwareHouseBis();
		devOps.setGiornateLavorate(10);
		devOps.setTariffaGiornaliera(300);
		System.out.println("costo devOps: " + devOps.getPrezzoDevOps());
		
		MainPreventivoSoftwareHouseBis dba = new MainPreventivoSoftwareHouseBis();
		dba.setGiornateLavorate(30);
		dba.setTariffaGiornaliera(350);
		System.out.println("costo dba: " + dba.getPrezzoDba());
				
		int totale = analistaFunzionale.getPrezzoAnalistaFunzionale() + graficoUxUi.getPrezzoGraficoUxUi() + sviluppatoreMobile.getPrezzoSviluppatoreMobile() + sviluppatoreFe.getPrezzoSviluppatoreFe() + sviluppatoreBe.getPrezzoSviluppatoreBe() + devOps.getPrezzoDevOps() + dba.getPrezzoDba();
		
		System.out.println("Totale preventivo: " + totale);
		
	}
	
}
