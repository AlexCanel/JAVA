package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double soma;
		soma = 0;
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();

		
		Products [] vetor = new Products [tamanhoVetor];
			
		for(int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o preço: ");
			double price = sc.nextDouble();
			vetor[i] = new Products(name, price);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		
		soma /= vetor.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", soma);
		
		sc.close();

	}

}
