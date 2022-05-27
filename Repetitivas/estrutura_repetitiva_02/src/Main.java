import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira coordenada: ");
		int coordenadax = sc.nextInt();
		System.out.println("Digite a segunda coordenada: ");
		int coordenaday = sc.nextInt();
		
		while (coordenaday != 0 && coordenadax != 0) {
			if(coordenadax > 0 && coordenaday > 0) {
				System.out.println("Primeiro");
			}else if(coordenadax < 0 && coordenaday > 0){
				System.out.println("Segundo");
			}else if(coordenadax < 0 && coordenaday < 0) {
				
			}
		}
		
		
		
		sc.close();

	}

}
