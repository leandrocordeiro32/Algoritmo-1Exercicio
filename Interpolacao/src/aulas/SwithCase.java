package aulas;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Entre com um número: ");
	int numero = leia.nextInt();
	
	switch (numero) {
	case 1:
		System.out.println("Você digitou o número 1");
		break;
	case 2:
		System.out.println("Você digitou o número 2");
		break;
	default:
		System.out.println("Você digitou um número maior que 2 ou uma letra");
		break;
	
	}
	
	System.out.println("Saiu do switch case");

		
	}

}
