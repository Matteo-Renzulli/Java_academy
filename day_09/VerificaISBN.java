package day_09;

import java.util.Scanner;

public class VerificaISBN {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un ISBN valido: ");
		String str = scanner.nextLine();
		str = str.replace("-", "");
		str = str.replace(" ", "");

		//if (str.charAt(str.length()).equals('X')) //
		//if (str.charAt(str.length() -1) == 'X')	//
		//	str = str.substring(0, str.length() -2); //
		char[] caratteri = str.toCharArray();	
		if (caratteri[caratteri.lenght -1] == 'X') {
			caratteri[caratteri.lenght -1  10;
			
		}
		int somma = 0;
		/*for (int i = caratteri.length -1, j = 0; i >= 1; i--, j++) {
			somma = somma + Character.getNumericValue(caratteri[j]) * i;*/
		
		for (int i = 0; i < caratteri.length; i++) {
			somma = somma + Character.getNumericValue(caratteri[i]) * (10 - i);
						
		}
		if (somma % 11 == 0) {
			System.out.println("ISBN è valido");
		}
		else {
			System.out.println("ISBN non è valido");
		}
			
	}

}
