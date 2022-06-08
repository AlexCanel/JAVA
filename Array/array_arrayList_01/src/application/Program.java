package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
			
		List<Funcionario> funcionario = new ArrayList<>(); 
		
		System.out.print("Quantos funcionarios devem ser registrados: ");
		int numeroFuncionario = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroFuncionario; i++) {
			System.out.println("\nEmployee #" + (i+1) + " :");
			System.out.print("\nDigite o Id: ");
			int id = sc.nextInt();
			while (hasId(funcionario, id)) {
				System.out.println("\nId repetido");
				System.out.print("Digite o Id: ");
				id = sc.nextInt();
				System.out.println();
			}
			System.out.print("\nDigite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("\nDigite o Salario: ");
			double salario = sc.nextDouble();
			funcionario.add(new Funcionario(id, nome,salario));
		}
		
		System.out.print("\nEntre com o id de aumento: ");
		int id = sc.nextInt();
		Funcionario emp = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp != null){
			System.out.print("Digite o aumento do salario: ");	
			double aumentoSalario = sc.nextInt();
			emp.increaseSalary(aumentoSalario);
		}else {
			System.out.println("Id inexistente");
		}
		
		for(Funcionario obj: funcionario) {
			System.out.println(obj);
		}
			
		sc.close();
		
	}

	private static boolean hasId(List<Funcionario> funcionario, int id) {
		Funcionario emp = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
