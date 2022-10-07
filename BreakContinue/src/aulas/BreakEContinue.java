package aulas;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("<<<Buscar números divisíveis por 7>>>\nEntre com um número: ");
		int num = sc.nextInt();
		
		System.out.print("\nEntre com o número limite: ");
		int max = sc.nextInt();
		
		for (int i = num ; i <= max ; i++) {
			
			System.out.println(i);
			
			if (i % 7 == 0) {
				System.out.print("O valor de i é: " + i);
				break;
			}
		}*/
		
		//Mesmo que GOTO. Usado em linguagens de baixo nível
		/*for (int i = 0 ; i <= 4 ; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}	
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}*/
		
		System.out.print("<<<Buscar mas não mostrar números divisíveis por 7>>>\nEntre com um número: ");
		int num = sc.nextInt();
		
		System.out.print("\nEntre com o número limite: ");
		int max = sc.nextInt();
		
		for (int i = num ; i <= max ; i++) {
						
			if (i % 7 == 0) {
				continue;
			}
			System.out.print("\nO valor de i é: " + i);

		}
		sc.close();
	}

}
