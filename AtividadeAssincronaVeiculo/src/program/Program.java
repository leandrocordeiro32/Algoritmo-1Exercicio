package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Carro carro;
	Moto moto;
	
	ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	char continua = 0;
	
	System.out.println("Bem-vinda ao SiCaV - Sistema de Cadastro de Veículos\n");

	do {
	System.out.print("\nPara iniciar o cadastro de veículo, selecione o tipo (1) para carro ou (2) para moto: ");
	
	int option = sc.nextInt();
	
	switch (option) {
	case 1:
		
		carro = new Carro();
		
		carro.setTipo("Carro");
		
		System.out.print("\nPotência ou cilindradas do motor: ");
		carro.setMotor(sc.nextDouble());
		
		System.out.print("\nQuantidade de pneus instalados no veículo: ");
		carro.setPneus(sc.nextInt());
		
		System.out.print("\nQuantidade de passageiros que o veículo transporta: ");
		carro.setPassageiros(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("\nO carro pode ser abastecido com qual(is) combustivel(is)? ");
		carro.setCombustivel(sc.nextLine());
		
		veiculos.add (carro);
		
		break;
		
	case 2:
		moto = new Moto();
		
		moto.setTipo("Motocicleta");
		
		System.out.print("\nPotência ou cilindradas do motor: ");
		moto.setMotor(sc.nextDouble());
		
		System.out.print("\nQuantidade de pneus instalados no veículo: ");
		moto.setPneus(sc.nextInt());
		
		System.out.print("\nQuantidade de passageiros que o veículo transporta: ");
		moto.setPassageiros(sc.nextInt());
		
		sc.nextLine();
		
		System.out.print("\nA moto pode ser abastecida com qual(is) combustivel(is)? ");
		moto.setCombustivel(sc.nextLine());
		
		veiculos.add(moto);
		
		break;	
		
	}
	
	System.out.print("\nDeseja cadastrar mais veículos? S/N: ");
	continua = sc.next().charAt(0);

	} while (Character.toUpperCase(continua) == 'S');
	
	for (Veiculo listaVeiculos : veiculos) {
		System.out.println(veiculos);
	}
	
	sc.close();
	
	}

}

/*Crie uma classe veiculo, uma classe moto e uma classe carro. carro e moto herdam atributos e
 *comportamentos da classe veiculo. Quantidade de pneus, motor (potencia ou cilindrada), quantidade
 *de passageiros, tipo de combustível, são alguns atributos básicos da classe veiculo.
 *Na tela principal cadastre mais de um tipo de veiculo usando um looping de repetição da sua escolha,
 *e depois mostre os veículos cadastrados em uma lista.*/