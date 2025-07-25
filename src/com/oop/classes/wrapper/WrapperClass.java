package com.oop.classes.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BOXING
		Integer x = new Integer(5);
		System.out.println(x);
		
		// AUTOBOXING
		Integer y = 35;
		System.out.println(y);
		
		// UNBOXING

		int nb = x;
		System.out.println(nb);
		
		
		//BOXING

		Double d = new Double(20.40d);
		System.out.println(d);

		//AUTOBOXING

		Double db = 15.60;
		System.out.println(db);

		//UNBOXING

		double dbl = db;
		System.out.println(dbl);
		
		System.out.println("=====================================================");
		
		// Dichiara un oggetto Double e assegna il suo valore a una variabile double primitiva.

		Double doppio = 15.49d;
		System.out.println("doppio: " + doppio);
		
		double primitivo = doppio;
		System.out.println("primitivo: " + primitivo);
		
		System.out.println("=====================================================");
		
		// Converti la stringa "123" in un int usando il metodo statico di Integer.

		String numero = "123";
		int numeroInt = Integer.parseInt(numero);
		System.out.println("Stringa 123 convertita in numero: " + numeroInt);
		
		System.out.println("=====================================================");
		
		// Dichiara una variabile int e assegnala a un oggetto Integer usando l'autoboxing.
		
		int variabile = 20;
		Integer nm = variabile;
		System.out.println("Variabile: " + nm);
		
		System.out.println("=====================================================");
		
		// Converti la stringa "45" in un oggetto Integer.
		
		String stringa = "45";
		int stringaInt = Integer.valueOf(stringa);
		System.out.println("Stringa 123 convertita in numero: " + stringaInt);
		
		System.out.println("=====================================================");
		
		// Crea due oggetti Integer con valore 1000 e verifica se sono uguali usando == e .equals().
		
		Integer valoreUno = 1000;
		Integer valoreDue = 7000;
		
		int valoreUnoInt = valoreUno;	// 1000
		int valoreDueInt = valoreDue;	// 1000

		if(valoreUnoInt == valoreDueInt) {
			System.out.println("uguale");;
		} else {
			System.out.println("diversi");
		}
		
		System.out.println("Sono uguali usando == ? " + (valoreUnoInt == valoreDueInt));
		System.out.println("Sono uguali usando il metodo .equals ? " + valoreUno.equals(valoreDue));
		boolean verifica = valoreUnoInt == valoreDueInt;
		System.out.println("Verifica: " + verifica);
		
		Integer sommaInteger = valoreUno + valoreDue;
		System.out.println("Somma di Integer: " + sommaInteger);
		
		System.out.println("=====================================================");
		
		// Converti un int in String usando Integer.toString.
		
		int intero = 27;
		String testoIntero = Integer.toString(intero);
		System.out.println("Intero trasformato in stringa: " + testoIntero);
		
		System.out.println("=====================================================");
		
		// Converte la stringa "127" in un oggetto Byte.
		
		String stringaTestuale = "127";
		Byte b = Byte.valueOf(stringaTestuale);
		System.out.println("String trasformato in Byte: " + b);
		
		System.out.println("=====================================================");
		
		// Verifica se il carattere '9' è una cifra numerica.
		
		Character carattere = '9';
		boolean verificaCarattere = Character.isDigit(carattere);
		System.out.println("È una cifra? " + verificaCarattere);
		
		System.out.println("=====================================================");
		
		// Converte la stringa "true" in yn xalore boolean.

		String parola = "true";
		boolean parolaBoolean = Boolean.parseBoolean(parola);
		System.out.println(parolaBoolean);
		
		System.out.println("=====================================================");
		
		//Converti la stringa "3.14" in un valore float. 
		
		String stringaFloat = "3.14";
		float floatValue = Float.parseFloat(stringaFloat);
		System.out.println("floatValue: " + floatValue);
		
		System.out.println("=====================================================");
		
		//Confronta due valori Double usando Double.compare.

		Double aA = 1.5;
		Double bB = 2.7;
		int risultato = Double.compare(aA, bB);
		System.out.println("Compare: " + risultato);
		
		System.out.println("=====================================================");
		
		//Crea un array di oggetti Integer con i valori da 1 a 5.

		Integer[] integerArray = new Integer[5];

		integerArray[0] = 1;
		integerArray[1] = 2;
		integerArray[2] = 3;
		integerArray[3] = 4;
		integerArray[4] = 5;
		
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println(integerArray[i]);
		}
		
		System.out.println("=====================================================");
		
		//Converte la stringa "12345" in un oggetto Short.
		
		String shortString= "12345";
		short convertShort = Short.parseShort(shortString);
		System.out.println("convertShort: " + convertShort);
		
		System.out.println("=====================================================");
		
		//Converte un oggetto Integer in una stringa tramite concatenazione.
		
		Integer elementoInteger = 566;
		String elementoString = "" + elementoInteger;
		System.out.println(elementoString);
		String provaString = "";
		System.out.println(provaString);
		System.out.println("hola");
		
		
		
	}

}
