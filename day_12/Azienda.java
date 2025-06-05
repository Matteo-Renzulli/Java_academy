package day_12;

public class Azienda {
	
	public static void main(String[] args) {
		Employee mario = new Employee("MRA", "Mario", 1000.0);
		System.out.println(mario.toString());
		EmployeeController.raiseSalary(mario, 0.10);
		System.out.println(mario);
	}
	

}
