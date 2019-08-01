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
	
	
	

}
