import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double num1, num2, divisao;
		num1 = num2 = divisao = 0;
		
		System.out.print("Digite a quantidade de repetições: ");
		int quantidade = sc.nextInt();
		
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("%nDigite 2 numeros: ");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			if(num2 != 0) {
				divisao = num1 / num2;
				System.out.printf("%nRESULTADO: %.1f%n", divisao);
			}else {
				System.out.printf("%ndivisao impossivel%n");
			}
		}
		
		sc.close();

	}

}
