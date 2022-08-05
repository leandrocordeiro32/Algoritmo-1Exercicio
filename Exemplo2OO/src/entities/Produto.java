package entities;

import java.util.Locale;

public class Produto {

	
	public String nomeProduto;
	public int quantidade; 	//não é necessário iniciar valor no int, no double, etc.
	public double valor;
	
	/*public Produto( ) {
		
	}*/
	
	public Produto(String nomeProduto, int quantidade, double valor) {
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	Locale locale = Locale.US;
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
	
	@Override //@ + Override + toString + ctrl esp ou toString + ctrl esp 
	public String toString() {
		
		return "\nNome Produto: " + nomeProduto
				+ "\nQuantidade: " + quantidade
				+ "\nValor Unitário: " + valor
				+ "\nValor total em estoque: " + (ValorTotalEmEstoque());
	}
	
}
