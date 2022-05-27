import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int quadrado, cubo;
		quadrado = cubo = 0;
		
		System.out.print("Digite a quantidade de repetições: ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			System.out.println(i + " " + quadrado + " " + cubo );
			
			
		}
		
		
		sc.close();

	}

}
