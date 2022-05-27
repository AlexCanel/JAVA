import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int impares;
		impares = 0;
		
		System.out.print("Digite um valor: ");
		int numero = sc.nextInt();
		
		
		
		if(numero >= 1 && numero <= 1000) {
			for(int i = 1; i <= numero; i++) {
				impares = i % 2;
				if(impares != 0) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();

	}

}
