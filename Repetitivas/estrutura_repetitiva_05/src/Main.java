import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int in, out, numero;
		in = out = numero = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de repetiçoes: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			if(numero>= 10 && numero <= 20) {
				in ++;
			}else {
				out ++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
