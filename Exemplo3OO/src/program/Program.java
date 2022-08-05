package program;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();

		
		System.out.print("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		produto.setNomeProduto(nome);
		
		System.out.println(produto.getNomeProduto());
		
		/*System.out.print("Entre com a quantidade do produto: ");
		int quantidade = sc.nextInt();
		produto.SetQuantidade(quantidade);*/
		
		System.out.print("Entre com o valor unitário do produto: ");
		double valor = sc.nextDouble();
		produto.setValor(valor);
				
		System.out.print("Entre com a quantidade a ser adicionada: ");
		int qtd = sc.nextInt();
		produto.AdicionarItem(qtd);
		
		System.out.println(produto);

		System.out.print("Entre com a quantidade a ser removida: ");
		qtd = sc.nextInt();
		produto.RemoverItem(qtd);
		
		System.out.println(produto);

		

		/*System.out.print("\nProduto: " + produto.nomeProduto);
		System.out.print("\nQuantidade: " + produto.quantidade);
		System.out.print("\nValor unitário: " + produto.valor + "\n");
		System.out.println("");
		produto.Estoque();
		
		System.out.println(produto);*/
		
		sc.close();
	}

}
