package com.oop.classes.intro;

public class Prodotto {
	
	// ATTRIBUTI
	
	public String brandProdotto;
	public String nomeProdotto;
	public String descrizioneProdotto;
	public int quantitaProdotto;
	public double prezzoProdotto;
	public int scontoProdotto;

	

	// COSTRUTTORE
	
	public Prodotto(String brandProdotto, String nomeProdotto, String descrizioneProdotto, int quantitaProdotto,
			double prezzoProdotto, int scontoProdotto) {
		super();
		this.brandProdotto = brandProdotto;
		this.nomeProdotto = nomeProdotto;
		this.descrizioneProdotto = descrizioneProdotto;
		this.quantitaProdotto = quantitaProdotto;
		this.prezzoProdotto = prezzoProdotto;
		this.scontoProdotto = scontoProdotto;
	}

	
	
	// GETTER & SETTER

	public String getBrandProdotto() {
		return brandProdotto;
	}



	public void setBrandProdotto(String brandProdotto) {
		this.brandProdotto = brandProdotto;
	}



	public String getNomeProdotto() {
		return nomeProdotto;
	}



	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}



	public String getDescrizioneProdotto() {
		return descrizioneProdotto;
	}



	public void setDescrizioneProdotto(String descrizioneProdotto) {
		this.descrizioneProdotto = descrizioneProdotto;
	}



	public int getQuantitaProdotto() {
		return quantitaProdotto;
	}



	public void setQuantitaProdotto(int quantitaProdotto) {
		this.quantitaProdotto = quantitaProdotto;
	}



	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}



	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}



	public int getScontoProdotto() {
		return scontoProdotto;
	}



	public void setScontoProdotto(int scontoProdotto) {
		this.scontoProdotto = scontoProdotto;
	}	
	
	public double getPrezzoScontato() {
		return getPrezzoProdotto() - ((getPrezzoProdotto() * getScontoProdotto()) / 100);
	}

}
