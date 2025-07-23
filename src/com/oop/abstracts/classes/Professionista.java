package com.oop.abstracts.classes;

public class Professionista extends SoftwareHouse{
	
	private int giornateLavoro;
	private int compensoAlGiorno;
	
	public Professionista(int giornateLavoro, int compensoAlGiorno) {
		super();
		this.giornateLavoro = giornateLavoro;
		this.compensoAlGiorno = compensoAlGiorno;
	}

	public int getGiornateLavoro() {
		return giornateLavoro;
	}

	public void setGiornateLavoro(int giornateLavoro) {
		this.giornateLavoro = giornateLavoro;
	}

	public int getCompensoAlGiorno() {
		return compensoAlGiorno;
	}

	public void setCompensoAlGiorno(int compensoAlGiorno) {
		this.compensoAlGiorno = compensoAlGiorno;
	}

	@Override
	public int getTotaleProfessionista() {
		// TODO Auto-generated method stub
		return getGiornateLavoro() * getCompensoAlGiorno();
	}
	
}