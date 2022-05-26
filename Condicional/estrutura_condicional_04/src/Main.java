import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o horario de inicio: ");
		int horarioInicio = sc.nextInt();
		System.out.print("Digite o horario de termino: ");
		int horarioTermino = sc.nextInt();
		
		int duracao;
		if (horarioInicio < horarioTermino) {
			duracao = horarioTermino - horarioInicio;
		}
		else {
			duracao = 24 - horarioInicio + horarioTermino;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
