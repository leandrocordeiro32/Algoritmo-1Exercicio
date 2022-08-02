package aulas;

import java.util.Scanner;

public class Atividade3Funcao {

	public static void main(String[] args) {
		// Crie um programa para calcular a formula do segundo grau, retorne valor de X1 e X2.
		Scanner sc = new Scanner(System.in);
		
		double a , b , c , bhaskara = 0;
		
		System.out.print("Insira o valor de A: ");
		a = sc.nextDouble();
		while (a == 0) {
			System.out.print("Insira o valor de A diferente de 0: ");
		a = sc.nextDouble();
		}
		
		System.out.print("Insira o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Insira o valor de C: ");
		c = sc.nextDouble();
		
		System.out.println("O valor de X¹ é " + equacaoGrauX (a , b , c));
		System.out.println("O valor de X² é " + equacaoGrauXX (a , b , c));
		
		sc.close();
		
	}
	
	public static double equacaoGrauX (double a , double b , double c) {
		return ((-b) + bhaskara (a , b , c)) / (2 * a);
	}
	
	public static double equacaoGrauXX (double a , double b , double c) {
		return ((-b) - bhaskara (a , b , c)) / (2 * a);

	}
	
	public static double bhaskara (double a , double b , double c) {
		return Math.sqrt((b * b) - (4 * a * c));
	}

}
