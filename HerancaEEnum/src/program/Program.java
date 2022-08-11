package program;

import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		//Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente();
		Conta conta = new Conta();
		
		conta.Depositar(100);
		contaCorrente.Depositar(200);
		
		conta.Sacar(50);
		contaCorrente.Sacar(50);
		
		System.out.println("Saldo da Conta: " + conta.getSaldo());
		System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
		
		/*
		
		System.out.println("Entre com o nome de titular: ");
		cliente.setNome(sc.nextLine());
		
		System.out.println("Entre com o CPF de titular: ");
		cliente.setCpf(sc.nextLine());
		
		contaCorrente.setTitular(cliente);
		
		System.out.println("Informe o número da Agência: ");
		contaCorrente.setAgencia(sc.nextInt());
		
		System.out.println("Informe o número da Conta: ");
		contaCorrente.setNumeroConta(sc.nextInt());
		
		System.out.println("Digite o valor para depósito: ");
		contaCorrente.Depositar(sc.nextDouble());
		
		System.out.println("Conta criada");
		
		System.out.println(contaCorrente);
		
		System.out.println("\nEntre com o valor do saque: ");
		contaCorrente.Sacar(sc.nextDouble());
		
		System.out.println("Saldo Atualizado: ");
		System.out.println(contaCorrente.getSaldo());
		*/
		sc.close();
	}

}
