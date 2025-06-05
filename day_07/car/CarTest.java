package day_07.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car panda = new Car();
		Car ferrari = new Car("AA000AA", "Ferrari", "Testarossa", 100.0, 1);
		Car bmw = new Car("AAA001AA", "BMW", "GT98", 60.0, 0.6);
		
		System.out.println("Targa Ferrari: " + ferrari.getTarga());
		ferrari.setTarga("AA000AB");
		System.out.println("Targa Ferrari: " + ferrari.getTarga());
		panda.setTarga("ZZ000ZZ");
		
		System.out.println("Targa Panda: " + panda.getTarga());
		panda.setMarca("Fiat");
		System.out.println("Marca Panda: " + panda.getMarca());
		panda.setModello("forti di cuore");
		System.out.println("Modello Panda: " + panda.getModello());
		panda.setFuel(30.0);
		System.out.println("Fuel Panda: " + panda.getFuel());
		panda.setConsumoMedio(1.5);
		System.out.println("Consumo medio Panda: " + panda.getConsumoMedio());
		
		System.out.println(panda.toString());
		System.out.println(ferrari);
		System.out.println(bmw);
		
		CarController.aggiornaFuel(ferrari, 10);
		System.out.println(ferrari);
		//Giusto dal punto di vista sintattico ma sbagliato dal punto di vista logico (riga successiva)
		CarController control = new CarController();
		
		control.aggiornaFuel(panda, 10);
		System.out.println(panda);
		

	}

}
