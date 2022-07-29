package aulas;

import java.util.Scanner;

public class Atividade1Array {

	public static void main(String[] args) {
		//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		double total = 0.0;
		double media = 0.0;
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print("Informe a nota: ");
			notas[i] = sc.nextDouble();
			while (notas[i] < 0 || notas[i] > 10) {
				System.out.print("Nota inválida! Digite a nota correta: ");
				notas[i] = sc.nextDouble();
			}
		}
		System.out.println("");

		for (double nota : notas) {
			System.out.println("Nota : " + nota + " pontos");
			System.out.println("*******************");
		}
		
		for (int i = 0 ; i < notas.length ; i++) {
			total = total + notas[i];
			media = total /4;
		}
		
		System.out.println("");
		System.out.println("Nota Média: " + media + " pontos");

		
		sc.close();


	}

	
}
