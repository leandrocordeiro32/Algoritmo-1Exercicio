package program;

import java.util.Scanner;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Entre com o nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.print("Entre com a idade: ");
		pessoa.idade = sc.nextInt();
		
		System.out.print("Entre com o gênero: ");
		pessoa.genero = sc.next().charAt(0);
		
		System.out.print(pessoa.nome + " " + pessoa.idade + " " + pessoa.genero);
		
		sc.close();

	}

}
