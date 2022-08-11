package program;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import entities.Clientes;
import entities.Conta;
import entities.ContaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		Conta conta = new Conta();
		
		Conta conta2 = new Conta();
		
		Clientes cliente = new Clientes();
		
		System.out.print("Informe a Agência da conta: ");
		conta.setAgencia(sc.nextInt());
		
		System.out.print("Informe o número da conta: ");
		conta.setConta(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("Informe o nome de titular da conta: ");
		cliente.setNome(sc.nextLine());
		//conta.setTitularDaConta(cliente);
		
		System.out.print("Informe o endereço de titular da conta: ");
		cliente.setEndereco(sc.nextLine());
		conta.setTitularDaConta(cliente);
		
		System.out.print("Saldo da conta: " + conta.getSaldo());
		
		System.out.print("\nInforme o valor a depositar: ");
		conta.Depositar(sc.nextDouble());
		
		System.out.println("\nSaldo atualizado: " + conta.getSaldo());
		
		System.out.println("Deseja sacar? ");
		conta.Sacar(sc.nextDouble());
		
		System.out.println("Saldo Atualizado: " + conta.getSaldo());
		
		System.out.println("Conta da Ana, saldo: R$ " + conta2.getSaldo());
		
		System.out.println("Qual o valor que vai transferir: ");
		double valor = sc.nextDouble();
		conta.Transferir(valor, conta2);
		
		System.out.println("Saldo Ana R$ " + conta2.getSaldo());
		System.out.println("Saldo R$ " + conta.getSaldo());
		

		System.out.println("\nAgência: " + conta.getAgencia()
		+ "\nConta: " + conta.getConta()
		+ "\nTitular: " + conta.getTitularDaConta().getNome()
		+ "\nEndereço: " + conta.getTitularDaConta().getEndereco()
		+ "\nSaldo: " + conta.getSaldo());
	
		} catch (ContaException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (MissingFormatArgumentException e2) {
			
		} catch (InputMismatchException e3) {
			System.out.println("Tipo incompatível, você digitou uma letra!");
		}
		
		sc.close();

	}

}
