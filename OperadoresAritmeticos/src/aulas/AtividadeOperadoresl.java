package aulas;

import java.util.Scanner;

public class AtividadeOperadoresl {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima a soma.
		
		Scanner leia = new Scanner(System.in);
		
		double a , b = 0.0;
		
		System.out.print("Insira um número qualquer: ");
		a = leia.nextDouble();
		
		System.out.print("Insira outro número qualquer: ");
		b = leia.nextDouble();
		
		System.out.println("A soma dos números é igual a " + (a + b));
		
		leia.close();


	}

}
