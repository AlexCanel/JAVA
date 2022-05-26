import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double area, raio, pi;
		
		pi = 3.14159;
		
		
		System.out.println("Digite o Raio: ");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2);
		
		System.out.printf("AREA = %.4f%n", area);
			
		sc.close();
		
	}
}