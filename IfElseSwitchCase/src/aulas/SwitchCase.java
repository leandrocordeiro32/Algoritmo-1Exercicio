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
	
	System.out.println("1 - Sanduiche natureba");
	System.out.println("2 - Sanduba Bomba");
	System.out.println("3 - Coxinha de Jaca");		   			
	System.out.println("4 - Feijoada vegetariana");	
	System.out.println("Escolha um dos itens de menu:");
	
	int menu = leia.nextInt();
	int quantidade = 0;
	
	switch (menu) {
	case 1:
		System.out.print("Sanduiche natureba");
		break;
	case 2:
		System.out.println("Sanduba Bomba");
		break;
	case 3:
		System.out.println("Coxinha de Jaca");
		break;
	case 4:
		System.out.println("Feijoada vegetariana");
		break;
	default:
		System.out.println("O item escolhido não existe no menu. Escolha um item do menu.");
	}
	
	System.out.println("Informe a quantidade: ");
	quantidade = leia.nextInt();
	
	System.out.println("Seu pedido foi " + quantidade + " " + menu);

	leia.close();

	}

}
