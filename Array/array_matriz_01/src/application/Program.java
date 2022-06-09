package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cont = 0;
		
		System.out.print("Digite a quantidade de linhas e colunas: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int [n][n];
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Digite um numero: ");
				matriz [i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Diagonal principal: ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					System.out.print(" " + matriz [i][j]);
				}if(matriz [i][j] < 0){
					cont ++;
				}
			}
		}
		
		System.out.println();
		System.out.println("\nNegative Numbers: " + cont);
		
		
		sc.close();

	}

}
