package day_07.insurance;

import java.time.LocalDate;

public class Customer {
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private LocalDate nascita;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String codiceFiscale, String nome, String cognome, LocalDate nascita) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	@Override
	public String toString() {
		return "Customer [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", nascita="
				+ nascita + "]";
	}

}
