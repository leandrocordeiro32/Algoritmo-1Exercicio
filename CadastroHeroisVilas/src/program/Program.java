package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Herois;
import entities.Viloes;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Herois herois;
		Viloes viloes;
		
		ArrayList<String> superPoderes = new ArrayList<>();

		ArrayList<Herois> heroisCad = new ArrayList<>();
		ArrayList<Viloes> viloesCad = new ArrayList<>();
		
		char option = 0;

		System.out.println("Você está no Cadastro Universal de Heróis e Vilões - CUHV\n");
		
		do {
			System.out.print("\nInforme (H) para cadastrar Heroína/Herói ou (V) para cadastrar Vilã/Vilão: ");
			option = sc.next().charAt(0);
			
			switch (Character.toUpperCase(option)){
			
			case 'H':
					
				herois = new Herois();
				
				sc.nextLine();

				System.out.print("\nInforme o nome da Heroína ou do Herói: ");
				herois.setNomeDeHeroi(sc.nextLine());
								
				System.out.print("Informe a ID Secreta: ");
				herois.setIdentidadeSecreta(sc.nextLine());
				
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
				
				sc.nextLine();
				
				do {
					System.out.print("Informe os superpoderes: ");
					superPoderes.add(sc.nextLine());
					
					System.out.print("Cadastrar mais um poder? S/N: ");
					option = sc.next().charAt(0);
					sc.nextLine();

				}while (Character.toUpperCase(option) == 'S');
				
				herois.setSuperPoderes(superPoderes);
				
				System.out.print("Informe o universo ao qual pertence: ");
				herois.setUniverso(sc.nextLine());
				
				System.out.print("Informe a qual Liga ou Grupo pertence: ");
				herois.setGrupoLiga(sc.nextLine());
				
				heroisCad.add(herois);
				
				break;
				
			case 'V':
					
				viloes = new Viloes();
				
				sc.nextLine();
				
				System.out.print("\nInforme o nome da Vilã ou do Vilão: ");
				viloes.setNomeDeVilao(sc.nextLine());
																
				System.out.print("Informe a ID Secreta: ");
				viloes.setIdentidadeSecreta(sc.nextLine());
				
				System.out.print("Está na ativa? S/N: ");
				option = sc.next().charAt(0);
				
				while(Character.toUpperCase(option) != 'S' && Character.toUpperCase(option) != 'N') {
					System.out.print("Está na ativa? S/N: ");
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
				
				sc.nextLine();
			
				do {
					System.out.print("Informe os superpoderes: ");
					superPoderes.add(sc.nextLine());
					
					System.out.print("Cadastrar mais um poder? S/N: ");
					option = sc.next().charAt(0);
					sc.nextLine();

				}while (Character.toUpperCase(option) == 'S');
				
				viloes.setSuperPoderes(superPoderes);

				System.out.print("Informe o universo ao qual pertence: ");
				viloes.setUniverso(sc.nextLine());
				
				System.out.print("Informe a qual Liga ou Grupo pertence: ");
				viloes.setGrupoLiga(sc.nextLine());
				
				viloesCad.add(viloes);
				
				break;
			}
			
		System.out.print("\nDeseja realizar outro cadastro? S para Sim ou N para Não: ");
		option = sc.next().charAt(0);

		} while (Character.toUpperCase(option) == 'S');
		
		for (Herois listaHerois : heroisCad) {
			System.out.println(listaHerois);
		}
		for (Viloes listaViloes : viloesCad) {
			System.out.println(listaViloes);
		}

		sc.close();

	}

}
