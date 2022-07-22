package aulas;

import java.util.Scanner;

public class AtividadeIfElse {

	public static void main(String[] args) {
		/*Faça um programa que peça o nome e a senha e faça a verificação de uma variável que obtenha
		 *a senha e o usuário (como se fosse cadastrado) e retorne erro caso a senha ou o usuário
		 *esteja errado. A mensagem a ser mostrada deve ser de acordo com o respectivo erro!
		*/
		
	Scanner leia = new Scanner(System.in);
	
	String usuarioCadastro = "Leandro";
	String usuario;
	int senhaCadastro = 123456;
	int senha = 0;
	
	System.out.print("Insira o nome de usuário: ");
	usuario = leia.nextLine();
	
	if (usuario.equals(usuarioCadastro)) {
		System.out.println("Usuário Ok");
	}
	else {
		System.out.println("Usuário Inválido");
	}
		
	System.out.print("Insira a senha: ");
	senha = leia.nextInt();
	
    if (senha == senhaCadastro) {
		System.out.println("Senha Ok");
	}
	else {
		System.out.println("Senha Inválida");
	}
	leia.close();

	}

}
