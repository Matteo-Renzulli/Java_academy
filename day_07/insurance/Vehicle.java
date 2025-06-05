package day_07.insurance;

public class Vehicle {
	private String targa;
	private Customer proprietario;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String targa, Customer proprietario) {
		super();
		this.targa = targa;
		this.proprietario = proprietario;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Customer getProprietario() {
		return proprietario;
	}
	public void setProprietario(Customer proprietario) {
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return "Vehicle [targa=" + targa + ", proprietario=" + proprietario + "]";
	}
	
}
