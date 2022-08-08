package entities;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	private String titularDaConta;
	
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
	public boolean Sacar (double valor) {
		if (valor > this.saldo) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}

	public String getTitularDaConta () {
		return titularDaConta;
	}
	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}


}
