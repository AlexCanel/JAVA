import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double imposto = 0;
		
		System.out.println("Tabela de Impostos: ");
		System.out.println("_________________________________________");
		System.out.println("|________________RENDA_________________|__IMPOSTO_DE_RENDA__|");
		System.out.println("|________de_ 0.00_a_R$_2000.00_________|_______ISENTO_______|");
		System.out.println("|___de_ R$_2000.01_ate_R$_3000.00______|_________8%_________|");
		System.out.println("|___de_R$_3000.01_ate_R$_4500.00_______|________18%_________|");
		System.out.println("|_________acima_de_R$_4500.00__________|________28%_________|");
		
		System.out.printf("%nDigite sua renda: ");
		double renda = sc.nextDouble();
		
	
		
		if(renda <= 2000) {
			System.out.printf("%nIsento");
		}else if(renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000) * 0.08;
		}else if(renda > 3000 && renda <= 4500) {
			imposto = ((renda - 3000) * 0.18 )+ (1000 * 0.08);
		}else {
			imposto = ((renda - 4500) * 0.28 ) + (1500 * 0.18) + (1000 * 0.08);
		}
		
		if(renda > 2000) {
		System.out.printf("%nR$ %.2f", imposto);
		}
		
		sc.close();
	}

}
