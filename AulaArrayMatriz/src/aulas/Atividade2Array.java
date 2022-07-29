package aulas;

import java.util.Scanner;

public class Atividade2Array {

	public static void main(String[] args) {
		/*Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu
		 *respectivo vetor. Imprima a idade e a altura na ordem. */
		
	Scanner sc = new Scanner(System.in);
	
	int[] idade = new int[5];
	double[] altura = new double[5];
	String[] nome = new String [5];
	
	for (int i = 0 ; i < 5 ; i++) {
		
		System.out.print("Informe seu nome: ");
		nome[i] = sc.nextLine();
		while (nome[i].length() < 3) {
			System.out.print("Nome inválido! Digite o nome correto: ");
			nome[i] = sc.nextLine();
		}
		System.out.print("Informe sua idade: ");
		idade[i] = sc.nextInt();
		while (idade[i] < 0 || idade[i] >= 150) {
			System.out.print("Idade inválida! Digite a idade correta: ");
			idade[i] = sc.nextInt();
		}
		
		System.out.print("Informe sua altura: ");
		altura[i] = sc.nextDouble();
		while (altura[i] <= 0 || altura[i] >= 3) {
			System.out.println("Altura inválida! Informe a altura correta: ");
			altura[i] = sc.nextDouble();
		}
		sc.nextLine();
		System.out.println("==========================================");
		
	}
	
	for (int i = 0 ; i < 5 ; i++) {
		System.out.println("--------------------------------------------");
		System.out.println(nome[i] + " tem " + idade[i] + " anos e mede " + altura[i] + " metros.");
		System.out.println("--------------------------------------------");
	}

	sc.close();

	}

}
