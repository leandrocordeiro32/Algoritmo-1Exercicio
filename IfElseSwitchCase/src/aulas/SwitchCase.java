package aulas;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		/*Faça um programa que peça ao usuário para escolher o item de um menu e a quantidade:(apenas 1 item)
		 * 1 - sanduiche natureba
		 * 2 - Sanduba Bomba
		 * 3 - Coxinha de Jaca
		 * 4 - Feijoada vegetariana
		 * */
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escolha um dos itens de menu");
	System.out.println("1 - Sanduiche natureba");
	System.out.println("2 - Sanduba Bomba");
	System.out.println("3 - Coxinha de Jaca");		   			
	System.out.println("4 - Feijoada vegetariana");
	System.out.println("Opção escolhida: ");
	
	int menu = leia.nextInt();
	int quantidade = 0;
	
	System.out.println("Informe a quantidade: ");
	quantidade = leia.nextInt();
	
	switch (menu) {
	case 1:
		System.out.println("Opção Escolhida: Sanduiche natureba");
		System.out.println("Quantidade: " + quantidade);
		break;
	case 2:
		System.out.println("Opção Escolhida: Sanduba Bomba");
		System.out.println("Quantidade: " + quantidade);
		break;
	case 3:
		System.out.println("Opção Escolhida: Coxinha de Jaca");
		System.out.println("Quantidade: " + quantidade);
		break;
	case 4:
		System.out.println("Opção Escolhida: Feijoada vegetariana");
		System.out.println("Quantidade: " + quantidade);
		break;
	default:
		System.out.println("O item escolhido não existe no menu. Escolha um item do menu.");
	}
	

	leia.close();

	}

}
