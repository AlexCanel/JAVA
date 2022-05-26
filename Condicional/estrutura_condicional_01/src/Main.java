import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
