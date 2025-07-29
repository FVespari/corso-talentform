/*
 * Crea una classe Studente con nome e età. 
 * Crea un ArrayList<Studente>, aggiungi 3 studenti e stampali.
 */

package com.collections;

import java.util.ArrayList;
import java.util.Comparator;



public class StudentePulito {
	
	private String nome;
	private int età;

	
	
	public StudentePulito(String nome, int età) {
		super();
		this.nome = nome;
		this.età = età;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getEtà() {
		return età;
	}



	public void setEtà(int età) {
		this.età = età;
	}



	@Override
	public String toString() {
		return "Studente [nome = " + nome + ", età = " + età + "]";
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Trova e stampa lo studente con età minore. (risoluzione per Gianfranco) 
		
		ArrayList<StudentePulito> studentiAccademiaGF = new ArrayList<StudentePulito>();
		
		studentiAccademiaGF.add(new StudentePulito("Giulia", 22));
		studentiAccademiaGF.add(new StudentePulito("Cesare", 21));
		studentiAccademiaGF.add(new StudentePulito("Marco", 19));
		studentiAccademiaGF.add(new StudentePulito("Antonio", 18));
		studentiAccademiaGF.add(new StudentePulito("Cicerone", 15));
		
		studentiAccademiaGF.sort(Comparator.comparing(StudentePulito:: getEtà));
		
		System.out.println("Stampo tutti gli studenti:");
		
		for (StudentePulito s : studentiAccademiaGF) {
			System.out.println(s);
		}
		
		System.out.println("Lo studente di minore età nell'array studentiAccademiaGF al momento è (versione Danai): " + studentiAccademiaGF.get(0));
		
	}

	
	
	
	
	
}