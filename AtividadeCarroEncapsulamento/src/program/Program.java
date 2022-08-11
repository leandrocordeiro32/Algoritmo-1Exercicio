package program;

import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Cliente cliente = new Cliente();
		
		System.out.println("Bem vindo ao SisCar.\n\nPara darmos início ao cadastro, informe:");
		
		System.out.print("\n> Nome da pessoa compradora do veículo: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("\n> CPF: ");
		cliente.setCpf(sc.nextLine());
		
		System.out.print("\n> Endereço: ");
		cliente.setEndereco(sc.nextLine());
		
		System.out.print("\n> Telefone: ");
		cliente.setTelefone(sc.nextLine());
		
		carro.setDadosCliente(cliente);
		
		System.out.print("\nAgora informe os dados do veículo a ser vendido:\n ");
		System.out.print("\n> Marca: ");
		carro.setMarca(sc.nextLine());
		
		System.out.print("\n> Modelo: ");
		carro.setModelo(sc.nextLine());
				
		System.out.println("\n> Ano: ");
		carro.setAno(sc.nextInt());

		sc.nextLine();

		System.out.println("\n> Cor: ");
		carro.setCor(sc.nextLine());
		
		System.out.println("\n> Tipo: ");
		carro.setTipo(sc.nextLine());
		
		System.out.println("\n> Câmbio: ");
		carro.setCambio(sc.nextLine());
		
		System.out.println("\n> Combustível: ");
		carro.setCombustivel(sc.nextLine());
		
		System.out.println("\n> Estado de uso: ");
		carro.setEstado(sc.nextLine());
		
		System.out.println("\n> Valor: ");
		carro.setValor(sc.nextDouble());
		
		System.out.println(carro);
		
		sc.close();

	}

}
