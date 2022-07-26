package aulas;

import java.util.Scanner;

public class AtividadeRepeticaI {

	public static void main(String[] args) {
		/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o
		 *valor seja inválido e continue pedindo até que o usuário informe um valor válido.*/
		
	Scanner sc = new Scanner(System.in);
	
	double nota = 0.0;
	
	System.out.println("Insira sua nota: ");
	nota = sc.nextDouble();		
	
	
	if (nota >= 0.0 && nota <= 10.0) 
	{
		System.out.println("Nota OK: " + nota);
	}
	else 
	{
		while (nota < 0.0 || nota > 10.0) 
		{
		System.out.println("Nota Inválida. Digite novamente: ");
		nota--;
		nota = sc.nextDouble();	
		}
		System.out.println("Nota OK: " + nota);

	}
	

	
	sc.close();

	}

}
