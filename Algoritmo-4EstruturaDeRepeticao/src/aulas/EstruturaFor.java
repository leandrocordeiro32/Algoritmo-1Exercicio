package aulas;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		//Usamos for quando já sabemos a quantidade de vezes que queremos executar determinado loop ou condição.
		for(int contador = 0; contador <= 5; contador++) {
			System.out.println("O contador está valendo: " + contador);
		}
			System.out.println("Fim do Programa");
		
		for(int contadorRev = 5; contadorRev >= 0 ; contadorRev--) {
			System.out.println("O contador reverso está valendo: " + contadorRev);
		}
		
			System.out.println("Fim do Programa");

		//Usamos while quando não sabemos a quantidade de vezes que precisamos executar determinado bloco de código.
		
		int contador = 0;
		while(contador <= 5) {
			System.out.println("O contador do while está valendo: " + contador);
			contador++;
		}
		
			System.out.println("Fim do Programa");

		//Usamos do while quando queremos que o bloco de código seja executado ao menos uma vez antes de testar.
		
		do {
			
			System.out.println("O contador do do while está valendo: " + contador); 
			contador++;
			
		} while(contador < 5);
		
				
		sc.close();

		}
	
	}
		
