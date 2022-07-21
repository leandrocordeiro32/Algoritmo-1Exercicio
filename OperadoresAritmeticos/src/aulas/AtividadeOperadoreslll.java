package aulas;

import java.util.Scanner;

public class AtividadeOperadoreslll {

	public static void main(String[] args) {
		/* Faça um Programa que peça a temperatura em graus Fahrenheit, 
		 * transforme e mostre a temperatura em graus Celsius
		 * C = 5 * ((F-32) / 9)
		 */

		Scanner leia = new Scanner(System.in);
		
		double f = 0.0;
		
		System.out.print("Informe a temperatura em Fahrenheit para convertermos em Celsius: ");
		f = leia.nextDouble();
		
		System.out.println("A temperatura em Celsius é " + (5 * (f - 32)/9) + " graus Celsius.");
		
		leia.close();
	}

}
