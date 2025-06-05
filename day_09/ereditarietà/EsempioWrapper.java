package day_09.ereditarietà;

public class EsempioWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d = 34.6;
		Integer i = 10;
		Number[] numeri = {d, i};
		int somma = 0;
		for(Number n : numeri) {
			if(n instanceof Double) {
				System.out.println("E'una double " + n);
			} else if (n instanceof Integer) {
				System.out.println("E' una integer " + n);
				double x = (Integer) n;
			}
			somma += n.doubleValue();
		}
		System.out.println(somma);

	}

}
