package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Herois {

	private String nomeDeHeroi , identidadeSecreta , universo , grupoLiga;
	private ArrayList<String> superPoderes;
	private boolean estaNaAtiva;
	
	public Herois () {
		
	}
	
	public Herois (String nomeDeHeroi , String identidadeSecreta , String universo ,  String grupoLiga ,
			ArrayList<String> superPoderes , boolean estaNaAtiva) {
		this.nomeDeHeroi = nomeDeHeroi;
		this.identidadeSecreta = identidadeSecreta;
		this.universo = universo;
		this.grupoLiga = grupoLiga;
		this.superPoderes = superPoderes;
		this.estaNaAtiva = estaNaAtiva;
		
	}
	
	public String getNomeDeHeroi () {
		return nomeDeHeroi;
	}
	public void setNomeDeHeroi(String nomeDeHeroi) {
		this.nomeDeHeroi = nomeDeHeroi;
	}
	public String getIdentidadeSecreta () {
		return identidadeSecreta;
	}
	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}
	public String getUniverso () {
		return universo;
	}
	public void setUniverso(String universo) {
		this.universo = universo;
	}
	public String getGrupoLiga() {
		return grupoLiga;
	}
	public void setGrupoLiga(String grupoLiga) {
		this.grupoLiga = grupoLiga;
	}
	public ArrayList<String> getSuperPoderes() {
		return superPoderes;
	}
	public void setSuperPoderes(ArrayList<String> superPoderes) {
		this.superPoderes = superPoderes;
	}
	public boolean getEstaNaAtiva() {
		return estaNaAtiva;
	}
	public void setEstaNaAtiva(boolean estaNaAtiva) {
		this.estaNaAtiva = estaNaAtiva;
	}
	
	public void herois() {
		Scanner sc = new Scanner(System.in);
		
		Herois herois = new Herois();
		
		ArrayList<String> superPoderes = new ArrayList<>();

		
		char option = 0;
		
		System.out.print("Informe o nome da Heroína ou do Herói: ");
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
		System.out.println(herois);
		
		sc.close();
	}
	@Override
	public String toString() {

		return "\nNome: " + getNomeDeHeroi()
		+ "\nID Secreta: " + getIdentidadeSecreta()
		+ "\nUniverso: " + getUniverso()
		+ "\nLiga ou Grupo: " + getGrupoLiga()
		+ "\nSuperpoderes: " + getSuperPoderes()
		+ "\nEstá na Ativa: " + getEstaNaAtiva();
	}
}

