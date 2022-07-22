package aulas;

import java.util.Scanner;

public class AtividadeEstruturaCondicional {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double numero1 , numero2 , numero3 = 0.0;
	
	//Faça um programa que leia dois números e imprima o maior deles;
	
	System.out.println("Programa 1");
	
	System.out.print("Insira um número qualquer: ");
	numero1 = leia.nextDouble();
	
	System.out.print("Insira outro número qualquer: ");
	numero2 = leia.nextDouble();
	
	if(numero1 > numero2) {
		System.out.println("O número maior é: " + numero1);
	}
	else {
		System.out.println("O número maior é: " + numero2);
	}

	//2)Faça um programa que leia 3 números e mostre o maior deles;
	
	System.out.println("Programa 2");

	System.out.print("Insira um número qualquer: ");
	numero1 = leia.nextDouble();
	
	System.out.print("Insira outro número qualquer: ");
	numero2 = leia.nextDouble();
	
	System.out.print("Insira o último número: ");
	numero3 = leia.nextDouble();
	
	if(numero1 > numero2 && numero1 > numero3) {
		System.out.println("O número maior é: " + numero1);
	}
	if(numero2 > numero1 && numero2 > numero3) {
		System.out.println("O número maior é: " + numero2);
	}
	else {
		System.out.println("O número maior é: " + numero3);
	}
	

	leia.close();
	
	}

}
