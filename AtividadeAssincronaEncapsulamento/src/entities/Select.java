package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Select {
	public void herois() {
		Scanner sc = new Scanner(System.in);
		
		Herois herois = new Herois();
		
		ArrayList<String> superPoderes = new ArrayList<>();

		
		char option = 0;
		
		System.out.print("\nInforme o nome da Heroína ou do Herói: ");
		herois.setNomeDeHeroi(sc.nextLine());
		
		System.out.print("Informe a ID Secreta: ");
		herois.setIdentidadeSecreta(sc.nextLine());
		
		System.out.print("Informe o universo ao qual pertence: ");
		herois.setUniverso(sc.nextLine());
		
		System.out.print("Informe a qual Liga ou Grupo pertence: ");
		herois.setGrupoLiga(sc.nextLine());
		
		do {
			System.out.print("Informe os superpoderes: ");
			superPoderes.add(sc.nextLine());
			
			System.out.print("Cadastrar mais um poder? S/N: ");
			option = sc.next().charAt(0);
			sc.nextLine();

		}while (Character.toUpperCase(option) == 'S');
		
		herois.setSuperPoderes(superPoderes);
		
		System.out.print("Está na ativa? S/N: ");
		option = sc.next().charAt(0);
		
		while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
			System.out.println("Está na ativa? S/N: ");
		option = sc.next().charAt(0);
		
		}
		switch (Character.toUpperCase(option)) {
		case 'S':
			herois.setEstaNaAtiva(true);
			break;
		case 'N':
			herois.setEstaNaAtiva(false);
			break;
		default:
			System.out.println("Comando Inválido");

		}
		
		System.out.println("\nNome: " + herois.getNomeDeHeroi() + "\nID Secreta: " + herois.getIdentidadeSecreta()
							+ "\nUniverso: " + herois.getUniverso() + "\nLiga ou Grupo: " + herois.getGrupoLiga()
							+ "\nSuperpoderes: " + herois.getSuperPoderes() + "\nEstá na Ativa: " + herois.getEstaNaAtiva());

		sc.close();		
		
	}
	public void viloes() {
		Scanner sc = new Scanner(System.in);
		
		Viloes viloes = new Viloes ();
		
		ArrayList<String> superPoderes = new ArrayList<>();
		
		char option = 0;
		
		System.out.print("\nInforme o nome da Vilã ou do Vilão: ");
		viloes.setNomeDeVilao(sc.nextLine());
		
		System.out.print("Informe a ID Secreta: ");
		viloes.setIdentidadeSecreta(sc.nextLine());
		
		System.out.print("Informe o universo ao qual pertence: ");
		viloes.setUniverso(sc.nextLine());
		
		System.out.print("Informe a qual Liga ou Grupo pertence: ");
		viloes.setGrupoLiga(sc.nextLine());
		
		do {
			System.out.print("Informe os superpoderes: ");
			superPoderes.add(sc.nextLine());
			
			System.out.print("Cadastrar mais um poder? S/N: ");
			option = sc.next().charAt(0);
			sc.nextLine();

		}while (Character.toUpperCase(option) == 'S');
		
		viloes.setSuperPoderes(superPoderes);
		
		System.out.print("Está na ativa? S/N: ");
		option = sc.next().charAt(0);
		
		while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
			System.out.println("Está na ativa? S/N: ");
		option = sc.next().charAt(0);
		
		}
		switch (Character.toUpperCase(option)) {
		case 'S':
			viloes.setEstaNaAtiva(true);
			break;
		case 'N':
			viloes.setEstaNaAtiva(false);
			break;
		default:
			System.out.println("Comando Inválido");

		}
		
		System.out.println("\nNome: " + viloes.getNomeDeVilao() + "\nID Secreta: " + viloes.getIdentidadeSecreta()
							+ "\nUniverso: " + viloes.getUniverso() + "\nLiga ou Grupo: " + viloes.getGrupoLiga()
							+ "\nSuperpoderes: " + viloes.getSuperPoderes() + "\nEstá na Ativa: " + viloes.getEstaNaAtiva());

		sc.close();		
		
	}

}

