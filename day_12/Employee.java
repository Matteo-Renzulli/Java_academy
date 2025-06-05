package day_12;

public class Employee {
	
	private String codiceFiscale;
	private String nome;
	private double stipendio;
	
	//costruttore di default va sempre messo
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//costruttore parametrico
	public Employee(String codiceFiscale, String nome, double stipendio) {
		super();
		
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Employee [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}
	
}
