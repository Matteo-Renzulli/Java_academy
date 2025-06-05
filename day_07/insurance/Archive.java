package day_07.insurance;

import java.time.LocalDate;

public class Archive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer bruno = new Customer("BRN", "Bruno", "Rossi", LocalDate.of(1985, 6, 25));
		Customer rosa = new Customer("RSO", "Rosa", "Rossi", LocalDate.of(1992, 4, 12));
		Customer viola = new Customer("VLI", "Viola", "Ferrari", LocalDate.of(1995, 9, 14));
		System.out.println(bruno);
		System.out.println(rosa);
		System.out.println(viola);
		Vehicle veicolo1 = new Vehicle("targa1", bruno);
		Vehicle veicolo2 = new Vehicle("targa2", rosa);
		Vehicle veicolo3 = new Vehicle("targa3", viola);
		System.out.println(veicolo1);
		System.out.println(veicolo2);
		System.out.println(veicolo3);
		System.out.println("-------------");
		Vehicle[] archivio = {veicolo1, veicolo2, veicolo3};
		for (int i = 0; i < archivio.length; i++) {
			System.out.println(archivio[i]);
		}

	}

}
