package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Insira o nme do titualr da conta: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.print("Existe algum depósito inicial (S/N) ? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.print("Insira o valor inicial de depósito: ");
			double depositoInicial = sc.nextDouble();	
			conta = new Conta(numeroConta, nomeCliente, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta, nomeCliente);
		}
		
		System.out.println();
		System.out.println("Informações da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println(" ################################################ ");
		System.out.print("Entre um valor para depósito: ");
		double montanteDepositado = sc.nextDouble();
		conta.deposito(montanteDepositado);
		System.out.println("Atualizando dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println(" ################################################ ");
		System.out.print("Entre um valor para saque: ");
		double montanteSacado = sc.nextDouble();
		conta.sacar(montanteSacado);
		System.out.println("Atualizando dados da conta:");
		System.out.println(conta);
		
		
		
		
		
		
		sc.close();
		


	}

}
