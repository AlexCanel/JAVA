import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double media, valor1, valor2, valor3;
		media = valor1 = valor2 = valor3 = 0;
		
		System.out.print("Digite a quantidade de repetições: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++){
			System.out.printf("%nDigite 3 valores: ");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
			System.out.printf("%nMedia: %.1f%n", media);
		}
		
		
		
		sc.close();
	}

}
