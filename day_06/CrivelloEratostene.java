package day_06;

//Esercizio_11: individuare i numeri primi in una serie
//Data una serie di numeri, individua i numeri primi

import java.util.Scanner;

public class CrivelloEratostene {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero e ti darò i numeri primi fino a quel numero: ");
		int numero = scanner.nextInt();
		boolean[] isPrimo = new boolean[numero + 1]; // creazione array booleano default false
		for (int i = 2; i <= numero; i++) {
			isPrimo[i] = true;
		}
		for (int i = 2; i * i <= numero; i++) {
			if (isPrimo[i])
				for (int j = i * i; j <= numero; j += i) {
					isPrimo[j] = false;
				}
		}
		for (int i = 2; i <= numero; i++) {
			if (isPrimo[i]) {
				System.out.println("Numeri primi fino a " + numero + ": " + i);
			}
		}
		scanner.close();
	}
}
