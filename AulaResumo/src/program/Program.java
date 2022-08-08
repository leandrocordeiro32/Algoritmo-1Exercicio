package program;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.print("Informe a Agência da conta: ");
		conta.setAgencia(sc.nextInt());
		
		System.out.print("Informe o número da conta: ");
		conta.setConta(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Informe o nome de titular da conta: ");
		conta.setTitularDaConta(sc.nextLine());
		
		System.out.print("Saldo da conta: " + conta.getSaldo());
		
		System.out.print("\nInforme o valor a depositar: ");
		conta.Depositar(sc.nextDouble());
		
		System.out.println("\nSaldo atualizado: " + conta.getSaldo());
		
		/*System.out.println("Deseja sacar? ");
		conta.Sacar(sc.nextDouble());
		
		System.out.println("Saldo Atualizado: " + conta.getSaldo());*/

		System.out.println("\nAgência: " + conta.getAgencia()
		+ "\nConta: " + conta.getConta()
		+ "\nTitular: " + conta.getTitularDaConta()
		+ "\nSaldo: " + conta.getSaldo());
		
		sc.close();

	}

}
