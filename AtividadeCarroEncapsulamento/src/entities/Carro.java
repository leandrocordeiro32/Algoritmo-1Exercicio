package entities;

public class Carro {

	/*Atributos da classe carro: ano, modelo, cor, tipo (caminhonete, hatch, sedan..), 
	 * cambio, tipo gasolina, valor, novo ou usado; os carros usados não podem ter mais 
	 * que 3 anos de uso.*/
	
	private int ano;
	private double valor;
	private String modelo , cor , tipo , cambio , combustivel , estado;
	private Cliente dadosCliente;
	
	public Carro() {
		
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getDadosCliente() {
		return dadosCliente;
	}
	public void setDadosCliente(Cliente dadosCliente) {
		this.dadosCliente = dadosCliente;
	}
}
