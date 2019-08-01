package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Insira o n�mero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Insira o nme do titualr da conta: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();
		System.out.println("Existe algum dep�sito inicial (S/N ?) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S') {
			System.out.println("Insira o valor inicial de dep�sito: ");
			double depositoInicial = sc.nextDouble();	
			conta = new Conta(numeroConta, nomeCliente, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta, nomeCliente);
		}
		
		System.out.println();
		System.out.println("Informa��es da Conta: ");
		System.out.println(conta);
		
		
		
		
		
		
		
		
		sc.close();
		


	}

}
