package com.giochi;

import java.util.Scanner;
import java.util.Random;

public class IndovinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numeroSegreto = rand.nextInt(100) + 1;
        int tentativo;
        
        System.out.println("Indovina il numero (da 1 a 100):");

        do {
            System.out.print("Il tuo tentativo: ");
            tentativo = input.nextInt();

            if (tentativo < numeroSegreto) {
                System.out.println("Troppo basso!");
            } else if (tentativo > numeroSegreto) {
                System.out.println("Troppo alto!");
            } else {
                System.out.println("Hai indovinato! Era " + numeroSegreto);
            }

        } while (tentativo != numeroSegreto);
        
        input.close();
		
	}

}