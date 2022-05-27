import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.printf("%nSenha Invalida%n");
			System.out.printf("%nDigite a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
