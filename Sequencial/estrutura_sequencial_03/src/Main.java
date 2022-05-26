import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a,b,c,d, total;
		
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = sc.nextInt();
		System.out.println("Digite o quarto numero: ");
		d = sc.nextInt();
		
		total = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d%n", total);
	}

}
