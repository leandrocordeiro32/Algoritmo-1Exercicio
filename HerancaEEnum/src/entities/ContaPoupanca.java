package entities;

public class ContaPoupanca extends Conta {

	public ContaPoupanca () {
		
	}
	public ContaPoupanca (int numeroConta , int agencia , double saldo , Cliente titular) {
		super (numeroConta , agencia , saldo , titular);
	}
	@Override
	public boolean Sacar(double valor) {
		if (valor <= this.saldo) {
			saldo -= valor + 1.00;  //Tem que mudar de private pra protected na Classe Conta.
			return true;
		} else {
			return false;
		}
	}
	public void Depositar (double valor) {
		this.saldo += valor;
	}
}
