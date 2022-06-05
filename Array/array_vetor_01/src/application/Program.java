package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double alturaTotal, mediaAltura; 
		alturaTotal = mediaAltura = 0;
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		double [] vetor = new double [tamanhoVetor];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite a " + (i+1) +"° numero: ");
			vetor [i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < vetor.length; i++) {
			alturaTotal = vetor[i] + alturaTotal;	
		}
		
		mediaAltura = alturaTotal / vetor.length;
		
		System.out.printf("Resultado: %.2f%n", mediaAltura);
		
		sc.close();

	}

}
