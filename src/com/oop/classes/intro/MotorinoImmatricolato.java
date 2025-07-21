/*
 * Scrivere la classe MotorinoImmatricolato sottoclasse della classe Motorino che ha in più 2 attributi: maxVelocità un numero con la virgola 
 * (coerente con la scelta fatta per l’attributo velocità) indicante la velocità massima in Km/h che il motorino può raggiungere; 
 * targa una stringa indicante la targa del motorino (ad entrambi gli attributi viene assegnato un valore nel costruttore). 
 * Aggiungere il metodo getMax il metodo stampa il valore dell’attributo maxVelocità. 
 * Ridefinire il metodo accelera in modo che prima di modificare la velocità effettui un controllo sulla velocità massima raggiunta. 
 * Il metodo definisce una variabile s (dello stesso tipo di velocità) ed assegna ad s la somma tra il valore del parametro del metodo 
 * ed il valore dell’attributo velocità; se s è minore del valore dell’attributo maxVelocità assegna il valore di s all’attributo velocità 
 * altrimenti assegna all’attributo velocità il valore dell’attributo maxVelocità.
 */

package com.oop.classes.intro;

public class MotorinoImmatricolato extends Motorino{
	
	public float maxVelocità;
	public String targa;
	
	public MotorinoImmatricolato(String colore, float velocità, String tipo, boolean antifurto, float maxVelocità, String targa) {
		super(colore, velocità, tipo, antifurto);
		// TODO Auto-generated constructor stub
		this.maxVelocità = maxVelocità;
		this.targa = targa;
	}



	public float getMaxVelocità() {
		return maxVelocità;
	}
	
	
	
	public void setMaxVelocità(float maxVelocità) {
		this.maxVelocità = maxVelocità;
	}
	

	
	public void stampaMaxVelocità() {
		System.out.println("Velocità Max: " + getMaxVelocità());
	}



	@Override
	public void accelera(float velocità) {		
	
//		if(!antifurto) {
//			this.velocità += velocità;
//			System.out.println("Il motorino ha velocità: " + this.velocità);
//		}
	
		float s = getVelocità() + velocità;
		
		if(s < getMaxVelocità()) {
			setVelocità(s);
		} else {
			setVelocità(getMaxVelocità());
		}
	
	}
	
	
	
	@Override
	public String toString() {
		return "Motorino [colore=" + colore + ", velocità=" + velocità + ", tipo=" + tipo + ", antifurto=" + antifurto + ", maxVelocità=" + maxVelocità + ", targa=" + targa + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
