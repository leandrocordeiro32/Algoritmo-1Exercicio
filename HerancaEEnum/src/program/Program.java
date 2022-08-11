package program;

import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Cliente cliente = new Cliente();
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		Conta conta = new Conta();
		
		/*conta.Depositar(100);
		contaCorrente.Depositar(200);
		
		conta.Sacar(50);
		contaCorrente.Sacar(50);
		
		System.out.println("Saldo da Conta: " + conta.getSaldo());
		System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());*/
		
		System.out.print("\nDeseja acessar a (C) conta-corrente ou a (P) poupança? ");
		char option = sc.next().charAt(0);
		
		if (Character.toUpperCase(option) == 'C') {
			
			System.out.print("Entre com o nome de titular: ");
			cliente.setNome(sc.nextLine());
			
			System.out.print("Entre com o CPF de titular: ");
			cliente.setCpf(sc.nextLine());
					
			conta.setTitular(cliente);

			System.out.print("Informe o número da Agência: ");
			conta.setAgencia(sc.nextInt());
			
			System.out.print("Informe o número da Conta: ");
			conta.setNumeroConta(sc.nextInt());
			
			System.out.print("Digite o valor para depósito: ");
			contaCorrente.Depositar(sc.nextDouble());
						
			System.out.print("Conta gerada!");

			System.out.print(contaCorrente);
			
			System.out.print("\nEntre com o valor do saque: ");
			contaCorrente.Sacar(sc.nextDouble());
			
			System.out.print("Saldo Atualizado: ");
			System.out.print(contaCorrente.getSaldo());
			
		} else if (Character.toUpperCase(option) == 'P') {
			
			System.out.print("Entre com o nome de titular: ");
			cliente.setNome(sc.nextLine());
			
			System.out.print("Entre com o CPF de titular: ");
			cliente.setCpf(sc.nextLine());
					
			conta.setTitular(cliente);

			System.out.print("Informe o número da Agência: ");
			conta.setAgencia(sc.nextInt());
			
			System.out.print("Informe o número da Conta: ");
			conta.setNumeroConta(sc.nextInt());
			
			System.out.print("\nDigite o valor para depósito: ");
			contaPoupanca.Depositar(sc.nextDouble());
			
			System.out.print("Poupança gerada");
			
			System.out.print(contaPoupanca);
			
			System.out.print("\nDigite o valor do saque: ");
			contaPoupanca.Sacar(sc.nextDouble());
			
			System.out.print("Saldo Atualizado: ");
			System.out.println(contaPoupanca.getSaldo());
		} else {
			
			System.out.println("Opção inválida");
		}
				
		sc.close();
	}

}
