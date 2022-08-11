package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro carro;
		Cliente cliente;
		
		ArrayList<Carro> carros = new ArrayList<>();
		char opt;
		
		System.out.println("Bem vindo ao SisCar.\n\nPara darmos início ao cadastro, informe:");
		
		System.out.print("\nDeseja cadastrar um veículo? S/N: ");
		opt = sc.next().charAt(0);
		
		while (Character.toLowerCase(opt) == 's') {
			
		try {
			carro = new Carro();
			cliente = new Cliente();
			
			sc.nextLine();
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
		
			
		System.out.print("\n> Ano: ");
		carro.setAno(sc.nextInt());
		

		sc.nextLine();

		System.out.print("\n> Cor: ");
		carro.setCor(sc.nextLine());
		
		System.out.print("\n> Tipo: ");
		carro.setTipo(sc.nextLine());
		
		System.out.print("\n> Câmbio: ");
		carro.setCambio(sc.nextLine());
		
		System.out.print("\n> Combustível: ");
		carro.setCombustivel(sc.nextLine());
		
		System.out.print("\n> Estado de uso: ");
		carro.setEstado(sc.nextLine());
		
		System.out.print("\n> Valor: ");
		carro.ValorDeCompra(sc.nextDouble());
		
		//System.out.print(carro);
		carros.add(carro);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("\nDeseja cadastrar um veículo? S/N: ");
		opt = sc.next().charAt(0);
			
		}
		
		//System.out.println(carros.get(0));
		for(Carro listaCarros : carros) {
			System.out.println(listaCarros);
		}
		System.out.println("OK! Até a volta!");
		
		sc.close();

	}

}
