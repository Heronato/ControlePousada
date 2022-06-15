package model;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		/* Aluguel de dez quartos:
		 * Um programa que inicie os 10 quartos
		 * vazios, e depois leia uma N(pode ser de 1 a 10).
		 * Registre o aluguel, nome e email dos hóspedes 
		 * e o quarto que ele escolheu. Ao final, mostre
		 * um relatório com todas as ocupações.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Aluguel #" + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel (nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i <10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		
		 

	}

}
