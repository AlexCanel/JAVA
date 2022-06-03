package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o raio: ");
		double radius = sc.nextDouble();
	
		System.out.printf("Circuference: %.2f%n", calculator.circunference(radius));
		System.out.printf("Volume: %.2f%n", calculator.volume(radius));
		System.out.printf("PI: %.2f%n", calculator.PI);
		
		sc.close();
		
	}

}
