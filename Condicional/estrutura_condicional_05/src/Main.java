import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valorPagar;
		valorPagar = 0;
		String invalido = "";
		
		System.out.println("Escolha a Opcao: ");
		System.out.println("_________________________________________");
		System.out.println("|_CODIGO_|___ESPECIFICAÇÃO____|__PREÇO__|");
		System.out.println("|___1____|__Cachorro_Quente___|_R$_4.00_|");
		System.out.println("|___2____|______X-Salada______|_R$_4.50_|");
		System.out.println("|___3____|______X-Bacon_______|_R$_5.00_|");
		System.out.println("|___4____|__Torrada_Simples___|_R$_2.00_|");
		System.out.println("|___5____|____Refrigerante____|_R$_1.50_|");
		
		System.out.println("");
		System.out.print("Digite o codigo: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		if(codigo == 1) {
			valorPagar = 4.00 * quantidade;
		}else if (codigo == 2) {
			valorPagar = 4.50 * quantidade;
		}else if (codigo == 3) {
			valorPagar = 5.00 * quantidade;
		}else if (codigo == 4) {
			valorPagar = 2.00 * quantidade;
		}else if (codigo == 5) {
			valorPagar = 1.50 * quantidade;
		}else {
			invalido = "Codigo Invalido";
		}
		
		if(valorPagar > 0) {
			System.out.printf("%nTotal: R$ %.2f", valorPagar);	
		}else {
			System.out.printf("%n%s",invalido);
		}
		
		sc.close();

	}

}
