import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo, quantidade;
		double valor, total, subTotal;
		
		valor = total = subTotal = 0;
		codigo = quantidade = 0;
		
		for (int i = 0; i < 2; i ++ ){
			System.out.print("Digite o codigo da peça: ");
			codigo = sc.nextInt();
			System.out.print("Digite a quantidade: ");
			quantidade = sc.nextInt();
			System.out.print("Digite o valor: ");
			valor = sc.nextDouble();
			subTotal = valor * quantidade; 
			total += subTotal;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
		
		sc.close();

	}

}
