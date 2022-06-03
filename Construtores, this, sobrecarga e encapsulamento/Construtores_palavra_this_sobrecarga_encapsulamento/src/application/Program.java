package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Conta conta;
	
		double deposito;
		
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe nome do titular: ");
		String name = sc.nextLine();
		
		System.out.print("Deseja Fazer um deposito inicial(S/N)?");
		char depositoInicial = sc.next().charAt(0);
		
		if (depositoInicial == 's' || depositoInicial == 'S') {
			System.out.print("Insira o valor do depósito inicial: ");
			double valorConta = sc.nextDouble();
			conta = new Conta(numeroConta, name, valorConta);
		}else {
			conta = new Conta(numeroConta, name);
		}
		
		System.out.println();
		System.out.printf("Account data: \n"+ conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.printf("Updated account data: \n"+ conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.printf("Updated account data: \n"+ conta);	
		
		sc.close();

	}

}
