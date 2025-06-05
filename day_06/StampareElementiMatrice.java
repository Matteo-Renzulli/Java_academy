package day_06;

//Esercizio_12: stampare gli elementi di una matrice
//Creare un programma Java che stampi gli elementi di una matrice

public class StampareElementiMatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 2, 3};	//inizio metodo alternativo
		int [] arr2 = {4, 5, 6};
		int [] arr3 = {7, 8, 9};
		
		int [][] arrCont = {arr1, arr2, arr3};	//fine metodo alternativo
		
		int [][] matrice = {{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}};
		for (int riga = 0; riga < matrice.length; riga++) {
			for (int colonna = 0; colonna < matrice[riga].length; colonna++) {
				System.out.print(matrice[riga][colonna] + " ");
			}
			System.out.println();
		}

	}

}
