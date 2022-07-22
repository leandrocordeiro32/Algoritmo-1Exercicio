package aulas;

import java.util.Scanner;

public class SwitchCaseI {

	public static void main(String[] args) {
		/*Faça um programa que peça ao usuário para digitar um numero entre 1 e 7  não podendo ser maior e nem menor. 
		 * O numero que a pessoa escolher representará um dia da semana (a semana começa no domingo).
		 */

	Scanner leia = new Scanner(System.in);
	
	int diaSemana = 0;
	
	System.out.println("Digite um número de 1 a 7 para escolher um dia da semana: ");
	diaSemana = leia.nextInt();
	
	switch (diaSemana) {
	case 1:
		System.out.println("Domingo");
		break;
	case 2:
		System.out.println("Segunda-feira");
		break;
	case 3:
		System.out.println("Terça-feira");
		break;
	case 4:
		System.out.println("Quarta-feira");
		break;
	case 5:
		System.out.println("Quinta-feira");
		break;
	case 6:
		System.out.println("Sexta-feira");
		break;
	case 7:
		System.out.println("Sábado");
		break;
	default:
		System.out.println("O número informado não faz parte do intervalo de 1 a 7!");
		break;
			
	}
	}

}
