import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha uma opção: ");
		System.out.println("______________________");
		System.out.println("|__OPÇÃO__|__ESOLHA__|");
		System.out.println("|____1____|__ALCOOL__|");
		System.out.println("|____2____|_GASOLINA_|");
		System.out.println("|____3____|__DIESEL__|");
		System.out.println("|____4____|____FIM___|");
		
		System.out.printf("%nDigite o codigo: ");
		int codigo = sc.nextInt();
		
		int alcool, gasolina, diesel;
		alcool = gasolina = diesel = 0;
		
		while(codigo != 4) {
			switch(codigo) {
			case 1:
				alcool ++;
				break;
			case 2:
				gasolina ++;
				break;
			case 3:
				diesel ++;
				break;
			default:
				System.out.printf("%nDigite um codigo valido.%n");
				break;
			}
			System.out.printf("%nDigite o codigo: ");
			codigo = sc.nextInt();	
		}
		
		if(codigo == 4) {
			System.out.printf("%nMUITO OBRIGADO%n");
		}
		
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		sc.close();
	}

}
