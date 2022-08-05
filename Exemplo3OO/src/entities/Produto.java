package entities;

public class Produto {

	
	private String nomeProduto;
	private int quantidade = 0; 	//não é necessário iniciar valor no int, no double, etc. Só por boa prática.
	private double valor;
	
	public Produto( ) {
		
	}
	
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;			
		} else {
			this.nomeProduto = "Padrão";
		}
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	/*public int GetQuantidade() {
		return quantidade;
	}
	public void SetQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = 0;
		}
	}
	public double GetValor() {
		return valor;
	}
	public void SetValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}else {
			this.valor = 0.00;
		}
		
	}*/
	@Override //@ + Override + toString + ctrl esp ou toString + ctrl esp 
	public String toString() {
		
		return "\nNome Produto: " + nomeProduto
				+ "\nQuantidade: " + quantidade
				+ "\nValor Unitário: " + valor
				+ "\nValor total em estoque: " + (ValorTotalEmEstoque());
	}
	
}
