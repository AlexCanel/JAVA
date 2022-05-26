import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, horas;
		double valorHora, total;
		
		System.out.print("Digite  o id do funcionario: ");
		id = sc.nextInt();
		System.out.print("Digite  o numero de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite  o valor hora: ");
		valorHora = sc.nextDouble();
		
		total = horas * valorHora;
		
		System.out.printf("Number: %d%n", id);
		System.out.printf("Salary: U$ %.2f%n", total);
		
	}

}
