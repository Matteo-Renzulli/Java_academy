package day_06;

//Esercizio_10b: verifica se è un numero primo
//Scrivi un programma Java che verifica se un numero dato è primo o meno

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci numero maggiore di 1:");
		int num = input.nextInt();
		boolean isPrimo = true;
		if (num <= 1) {
			isPrimo = false;
		} else {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					isPrimo = false;
				} //else {
					//isPrimo = true;
				//}
				break;
			}
		}
		System.out.println("Numero " + num + (isPrimo ? " è primo" : " non è primo"));
		input.close();
	}

}
