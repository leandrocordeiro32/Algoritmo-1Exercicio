package aulas;

import java.util.Scanner;

public class AtividadeOperadoreslll {

	public static void main(String[] args) {
		/* Faça um Programa que peça a temperatura em graus Fahrenheit, 
		 * transforme e mostre a temperatura em graus Celsius
		 * C = 5 * ((F-32) / 9)
		 */

		Scanner leia = new Scanner(System.in);
		
		double fahrenheit = 0.0;
		double celsius = 0.0;
		
		System.out.print("Informe a temperatura em Fahrenheit para convertermos em Celsius: ");
		fahrenheit = leia.nextDouble();
		
		celsius = (5 * (fahrenheit - 32)/9);
		
		System.out.println("A temperatura em Celsius é " + celsius + " graus Celsius.");
	
		
		leia.close();
	}

}
