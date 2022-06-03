package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dólar? ");
		double precoDollar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados?  ");
		double cotacaoDollar = sc.nextDouble();		
				
		double cotacao = Calculadora.cotacao(precoDollar, cotacaoDollar);
		
		System.out.printf("Valor a ser pago em reais = R$ %.2f%n", cotacao);
		
		
		
		sc.close();
	}

}
