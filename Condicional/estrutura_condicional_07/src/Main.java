import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a primeira coordenada: ");
		double coordenadax = sc.nextDouble();
		System.out.print("Digite a segunda coordenada: ");
		double coordenaday = sc.nextDouble();
		
		if(coordenadax > 0 && coordenaday > 0) {
			System.out.println("Q1");
		}else if (coordenadax < 0 && coordenaday > 0) {
			System.out.println("Q2");
		}else if (coordenadax < 0 && coordenaday < 0) {
			System.out.println("Q3");
		}else if (coordenadax > 0 && coordenaday < 0) {
			System.out.println("Q4");
		}else {
			System.out.println("Origem");
		}
		
		
		sc.close();

	}

}
