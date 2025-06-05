package day_06;

//Esercizio_10a: verifica se un numero è pari o dispari
//Scrivi un programma Java che verifica se un numero dato è pari o dispari

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		
		int numero = input.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Numeri pari");
		} else {
			System.out.println("Numeri dispari");
		}
		input.close();
	}

}
