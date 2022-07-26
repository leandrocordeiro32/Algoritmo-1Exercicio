package aulas;

import java.util.Scanner;

public class AtividadeRepeticaoII {

	public static void main(String[] args) {
		/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
		 *igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
		
	Scanner sc = new Scanner(System.in);
	
	String usuario , senha;
	
	
	System.out.print("Informe o nome de usuário: ");
	usuario = sc.nextLine();
	
	System.out.print("Informe a senha: ");
	senha = sc.nextLine();
	
	while (usuario.equals(senha)) {
		System.out.println("Nome de usuário e senha iguais. Informe nome de usuário diferente da senha!");
		
		System.out.print("Informe o nome de usuário: ");
		usuario = sc.nextLine();
		
		System.out.print("Informe a senha: ");
		senha = sc.nextLine();
	}
		
	System.out.println("Nome de usuário e senha OK");
	
	sc.close();

	}

}
