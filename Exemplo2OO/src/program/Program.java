package program;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o nome do produto: ");
		//produto.nomeProduto = sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Entre com a quantidade do produto: ");
		//produto.quantidade = sc.nextInt();
		int quantidade = sc.nextInt();
		
		System.out.print("Entre com o valor unitário do produto: ");
		//produto.valor = sc.nextDouble();
		double valor = sc.nextDouble();
		
		Produto produto = new Produto(nome);

		/*System.out.print("\nProduto: " + produto.nomeProduto);
		System.out.print("\nQuantidade: " + produto.quantidade);
		System.out.print("\nValor unitário: " + produto.valor + "\n");
		System.out.println("");
		produto.Estoque();*/
		
		System.out.println(produto);
		
		sc.close();
	}

}
