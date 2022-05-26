import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double ladoA, ladoB, ladoC, pi, triangulo, circulo, trapezio, quadrado, retangulo;
		
		ladoA = ladoB = ladoC = triangulo = circulo = trapezio = quadrado = retangulo = 0;
		
		pi = 3.14159;
		
		System.out.print("Digite A: ");
		ladoA = sc.nextDouble();
		System.out.print("Digite B: ");
		ladoB = sc.nextDouble();
		System.out.print("Digite C: ");
		ladoC = sc.nextDouble();
		
		triangulo = ladoA * ladoC / 2;
		circulo = pi * Math.pow(ladoC, 2);
		trapezio = (ladoA + ladoB) * ladoC / 2;
		quadrado = Math.pow(ladoB, 2);
		retangulo = ladoA * ladoB;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
