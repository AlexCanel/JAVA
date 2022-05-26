import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int numero2 = sc.nextInt();
		
		int multiplos1 = numero1 % numero2;
		int multiplos2 = numero2 % numero1;
		
		if(multiplos1 == 0 || multiplos2 == 0) {
			System.out.println("Sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();

	}

}
