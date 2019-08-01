package entities;

public class Conta {
	
	private int numeroConta;
	private String nomecliente;
	private double balanco;
	
	public Conta(int numeroConta, String nomecliente) {
		this.numeroConta = numeroConta;
		this.nomecliente = nomecliente;
	}

	public Conta(int numeroConta, String nomecliente, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomecliente = nomecliente;
		deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
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

	public void deposito(double montante) {
		balanco += montante;
		
	}
	
	public void sacar(double montante) {
		balanco -= montante + 5.0;
	}
}
