package com.variabili.esempio;

public class EsempioVariabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Variabili");
		/*
		int a = 9;
		int b = 3;
		
		if (a>b || b>a) { // QUI OTTENGO FALSO PERCHÉ >>> FALSO + FALSO = FALSO		
			System.out.println("2- FALSO");
			
			if(a>b || b>a) { // QUI OTTENGO VERO PERCHÉ >>> VERO + FALSO = VERO
				System.out.println("3- VERO"); // + check);
			}
		} // non è necessario l'else, se non mi serve posso ometterlo
		
		System.out.println("CHIUSURA");
		*/
		
		
		int day = 9;
		
		switch (day) {
		case 1: {
			System.out.println("Lun");
			break;
			}
		case 2: {
			System.out.println("Mar");
			break;
			}
		case 3: {
			System.out.println("Mer");
			break;
			}
		case 4: {
			System.out.println("Gio");
			break;
			}
		case 5: {
			System.out.println("Ven");
			break;
			}
		case 6: {
			System.out.println("Sab");
			break;
			}
		case 7: {
			System.out.println("Dom");
			break;
			}
			//yield type;
		default:
			System.out.println("Giorno non della settimana");
		}
		
		
		
		
		
		
		
		
		
	}

}
















/*

//boolean pippo = false;

//System.out.println("-----------------------------------------------------");
//System.out.println("1- Valore di check fuori dagli IF fissato all'inizio: " + check);
//System.out.println("-----------------------------------------------------");

if (a>b || b>a) { // QUI OTTENGO VERO PERCHÉ >>> VERO + FALSO = VERO		
	//check = true;
	System.out.println("2- VERO"); //+ check);
	
	if(a<b || b>a) { // QUI OTTENGO FALSO PERCHÉ >>> FALSO + FALSO = FALSO
		//check = false;
		System.out.println("3- FALSO"); // + check);
	}
} // non è necessario l'else, se non mi serve posso ometterlo

System.out.println("CHIUSURA");

}

*/