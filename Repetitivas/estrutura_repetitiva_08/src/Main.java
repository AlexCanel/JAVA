import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Long fatorial;
		
		fatorial = 1L;
		
		System.out.print("Digite a quantidade de repetições: ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
