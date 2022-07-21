package aulas;

import java.util.Scanner;

public class AtividadeOperadoresII {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
          trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/

		Scanner leia = new Scanner(System.in);
		
		double valor , horas = 0.0;
		
		System.out.print("Qual valor da sua hora de trabalho? ");
		valor = leia.nextDouble();
		
		System.out.print("Qual o número de horas trabalhadas no mês? ");
		horas = leia.nextDouble();
		
		System.out.println("Salário a receber no referido mês é R$ " + (valor * horas));
		
		//Outra forma de resolver:
		
        //double valor , horas = 0.0;
		double salario = 0.0;
		
		System.out.print("Qual valor da sua hora de trabalho? ");
		valor = leia.nextDouble();
		
		System.out.print("Qual o número de horas trabalhadas no mês? ");
		horas = leia.nextDouble();
		
		salario = valor * horas;
		
		System.out.println("Salário a receber no referido mês é R$ " + salario);
		
		
		leia.close();
	}

}
