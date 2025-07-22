package com.oop.classes.intro;

public class CapoAbbigliamentoFV extends TipoCapoAbbigliamentoFV {

	private String taglia;
	private int quantitàAcquistata;
	private int quantitàDisponibile;
	
	public CapoAbbigliamentoFV(String marca, String modello, float costo, String taglia, int quantitàAcquistata, int quantitàDisponibile) {
		super(marca, modello, costo);
		// TODO Auto-generated constructor stub
		this.taglia = taglia;
		this.quantitàAcquistata = quantitàAcquistata;
		this.quantitàDisponibile = quantitàAcquistata;
	}
	
	public void venduto(int capiVenduti){
		if(quantitàDisponibile > quantitàDisponibile - capiVenduti) {
			quantitàDisponibile -= capiVenduti;
		}
	}

	public String getDettagli() {
		return "CapoAbbigliamento [taglia= " + taglia + ", quantitàAcquistata= " + quantitàAcquistata + ", quantitàDisponibile= " + quantitàDisponibile + "]";
	}
	
	

}
