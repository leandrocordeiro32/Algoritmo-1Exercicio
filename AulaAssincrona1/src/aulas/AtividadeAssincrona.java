package aulas;

import java.util.Scanner;

public class AtividadeAssincrona {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int voto = 0;
	int molusco = 0, gomes = 0 , bozo = 0 , bolim = 0;
	
	System.out.println("Vote 12 para Gomes");
	System.out.println("Vote 13 para Molusco");
	System.out.println("Vote 17 para Bozo");
	System.out.println("Vote 50 para Bolim");
	System.out.println();
	System.out.print("Se a eleição fosse hoje, qual seria sua intençao de voto? ");
	voto = sc.nextInt();
	
		while (voto == 12) {
		gomes += 1;
		System.out.print("Se a eleição fosse hoje, qual seria sua intençao de voto? ");
		voto = sc.nextInt();
		}
			
		while (voto == 13) {
		molusco += 1;
		System.out.print("Se a eleição fosse hoje, qual seria sua intençao de voto? ");
		voto = sc.nextInt();
		}
		
		while (voto == 17) {
		bozo += 1;
		System.out.print("Se a eleição fosse hoje, qual seria sua intençao de voto? ");
		voto = sc.nextInt();
		}
		
		while (voto == 50) {
		bolim += 1;
		System.out.print("Se a eleição fosse hoje, qual seria sua intençao de voto? ");
		voto = sc.nextInt();
		}
		
	System.out.println(" ");
	System.out.println("Pesquisa Encerrada - Resultado:");
	System.out.println(" ");
	System.out.println("Molusco recebeu " + molusco + " intenções de votos");
	System.out.println("Gomes recebeu " + gomes + " intenções de votos");
	System.out.println("Bozo recebeu " + bozo + " intenções de votos");
	System.out.println("Bolim recebeu " + bolim + " intenções de votos");

	sc.close();

	
	}
	
	}
