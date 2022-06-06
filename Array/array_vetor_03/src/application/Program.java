package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AlocacaoQuartos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		AlocacaoQuartos [] alunos = new AlocacaoQuartos[10];
		
		System.out.print("Quantos alunos irão alugar um quarto: ");
		int quantidadeAlunos = sc.nextInt();
		
		for(int i = 0; i < quantidadeAlunos; i++) {
			sc.nextLine();
			System.out.println("Cadastro #" + (i+1) + ":");
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite o email: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto: ");
			int quarto = sc.nextInt();
			alunos [quarto] = new AlocacaoQuartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos Alugados: ");
		
		for(int i = 0; i < 10; i++) {
			if (alunos[i] != null){
				System.out.printf(i + ":" + alunos[i] + "%n");
			}
		}
		
		
		
		
		System.out.println();
		
		sc.close();

	}

}
