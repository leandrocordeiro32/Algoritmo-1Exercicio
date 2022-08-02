package aulas;

import java.util.Scanner;

public class Atividade3Funcao {

	public static void main(String[] args) {
		// Crie um programa para calcular a formula do segundo grau, retorne valor de X1 e X2.
		Scanner sc = new Scanner(System.in);
		
		double a = 0.0, b = 0.0, c = 0.0;
		
		System.out.print("Insira o valor de A: ");
		a = sc.nextDouble();
		while (a == 0) {
			System.out.print("Valor de A precisa ser maior que 0! Informe o valor de A: ");
			a = sc.nextDouble();
		}
		
		System.out.print("Insira o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Insira o valor de C: ");
		c = sc.nextDouble();
		
		equacaoGrau (a , b , c);
		
		sc.close();
		
	}
	
	public static void equacaoGrau (double a , double b , double c) {
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0) {
			System.out.print("\nDelta com valor negativo! Equação não pode ser calculada!");
		}
		else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.print("\nO valor de x¹ é " + x1 + ".\n");
			System.out.print("O valor de x² é " + x2 + ".");
		}

		
	}
	
	
}
