import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("___________________________________");
		System.out.println("|_CODIGO_|________DESCRICAO_______|");
		System.out.println("|___1____|_ALIMENTO_NÃO-PERECIVEL_|");
		System.out.println("|___2____|___ALIMENTO_PERECIVEL___|");
		System.out.println("|___3____|________VESTUARIO_______|");
		System.out.println("|___4____|_________LIMPEZA________|");
		System.out.println();
		
		System.out.print("Digite o codigo do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println();
		
		String name;
		
		switch(codigo) {
	
		case 1:
			name = "ALIMENTO NÃO-PERECIVEL";
			break;
		case 2:
			name = "ALIMENTO PERECIVEL";
			break;
		case 3:
			name = "VESTUARIO";
			break;
		case 4:
			name = "LIMPEZA";
			break;
		default:
			name = "CODIGO INVALIDO";
			break;
		}
		
		System.out.println(name);

		
		sc.close();
	}

}
