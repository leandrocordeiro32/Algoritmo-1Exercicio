package entities;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numeroConta , int agencia , double saldo , Cliente titular) {
		super(numeroConta , agencia , saldo , titular);
	}
	
	@Override
	public boolean Sacar(double valor) {
		if (valor <= this.saldo) {
			saldo -= valor + 4.90;  //Tem que mudar de private pra protected na Classe Conta.
			return true;
		} else {
			return false;
		}
	}
	public void Depositar (double valor) {
		this.saldo += valor;
	}

}
