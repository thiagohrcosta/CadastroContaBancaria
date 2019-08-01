package entities;

public class Conta {
	
	private int numeroConta;
	private String nomecliente;
	private double balanco;
	
	public Conta(int numeroConta, String nomecliente) {
		this.numeroConta = numeroConta;
		this.nomecliente = nomecliente;
	}

	public Conta(int numeroConta, String nomecliente, double balanco) {
		this.numeroConta = numeroConta;
		this.nomecliente = nomecliente;
		this.balanco = balanco;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public double getBalanco() {
		return balanco;
	}

	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}
	
	
	

}
