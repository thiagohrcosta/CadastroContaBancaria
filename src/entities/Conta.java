package entities;

public class Conta {
	
	private int numeroConta;
	private String nomeCliente;
	private double balanco;
	
	public Conta(int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}

	public Conta(int numeroConta, String nomeCliente, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Cliente: "
				+ nomeCliente
				+", Balancço: $ "
				+ String.format("%.2f", balanco);
	}
}
