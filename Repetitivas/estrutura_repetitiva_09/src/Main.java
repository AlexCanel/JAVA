import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int divisao;
		divisao = 0;
		
		
		System.out.print("Digite a quantidade de repeti��es: ");
		int numero = sc.nextInt();
		
		for(int i = 1;i <= numero; i++) {
			divisao = numero % i;
			if(divisao == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
