package entities;

public class Carro {

	/*Atributos da classe carro: ano, modelo, cor, tipo (caminhonete, hatch, sedan..), 
	 * cambio, tipo gasolina, valor, novo ou usado; os carros usados não podem ter mais 
	 * que 3 anos de uso.*/
	
	private int ano;
	private double valor;
	private String marca , modelo , cor , tipo , combustivel , cambio , estado;
	private Cliente dadosCliente;
	
	public Carro() {
		
	}
	public Carro (Cliente dadosCliente , String marca , String modelo , int ano , String cor , String tipo ,
			String cambio , String combustivel , String estado , double valor) {
		this.dadosCliente = dadosCliente;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.tipo = tipo;
		this.cambio = cambio;
		this.combustivel = combustivel;
		this.estado = estado;
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) throws Exception {
		if (ano >= 2019) {
			this.ano = ano;
		} else {
			throw new Exception("Não pode ser efetuado cadastro. Carro com ano incompatível (mais que 3 anos de uso)");
		}
	}
	public double getValor() {
		return valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
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
	public void ValorDeCompra(double valor) {
		this.valor += (valor + (valor * 0.4));
	}
	@Override
	public String toString() {
		
		return "\nRECIBO DE COMPRA\n\n" + dadosCliente.getNome() + ", portador(a) do CPF " + dadosCliente.getCpf() + ", residente no endereço "
				+ dadosCliente.getEndereco() + ", telefone " + dadosCliente.getTelefone() + ",\nadquiriu o veículo Marca "
				+ marca + ", modelo " + modelo + ", ano " + ano + ", cor " + cor + ".\nO veículo é do tipo " + tipo + ", com câmbio " + cambio + " e pode ser abastecido com "
				+ combustivel + ".\nO veículo é " + estado + " e foi vendido por Leona's Car pelo valor de R$ " 
				+ valor;
	}
}
