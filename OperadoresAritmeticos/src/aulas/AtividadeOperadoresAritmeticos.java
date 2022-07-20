package aulas;

import java.util.Scanner;

public class AtividadeOperadoresAritmeticos {

	public static void main(String[] args) {
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

		Scanner leia = new Scanner(System.in);
		
		double nota1 , nota2 , nota3 , nota4 = 0.0;
		
		System.out.print("Insira a 1ª nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Insira a 2ª nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Insira a 3ª nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Insira a 4ª nota: ");
		nota4 = leia.nextDouble();
			
		System.out.println("A média das suas notas é: " + (nota1 + nota2 + nota3 + nota4)/4);		
		
		leia.close();
		

	}

}
