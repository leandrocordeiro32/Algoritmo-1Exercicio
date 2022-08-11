package entities;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	private Clientes titularDaConta;

	
	public Conta() {
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia (int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void Depositar (double valor) {
		this.saldo += valor;
	}
	public boolean Sacar (double valor) throws ContaException { 
		if (valor <= this.saldo) { 
			this.saldo -= valor;
			return true;
		}else {
			throw new ContaException("Saldo indisponível!");
			//return false;
		}
	}
	
	public boolean Transferir(double valor , Conta destino) throws ContaException {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			throw new ContaException("Saldo indisponível!");
			//return false;
		}
	}
	public Clientes getTitularDaConta () {
		return titularDaConta;
	}
	public void setTitularDaConta(Clientes titularDaConta) {
		this.titularDaConta = titularDaConta;
	}


}
