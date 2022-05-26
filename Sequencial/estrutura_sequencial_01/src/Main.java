import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int soma, num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("SOMA = %d%n", soma);
			
		sc.close();
		
	}
}