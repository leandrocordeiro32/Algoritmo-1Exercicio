package entities;

import java.util.ArrayList;

public class Viloes {
	private String nomeDeVilao , identidadeSecreta , universo , grupoLiga;
	private ArrayList<String> superPoderes;
	private boolean estaNaAtiva;
	
	public Viloes () {
		
	}
	
	public Viloes (String nomeDeVilao , String identidadeSecreta , String universo ,  String grupoLiga ,
			ArrayList<String> superPoderes , boolean estaNaAtiva) {
		this.nomeDeVilao = nomeDeVilao;
		this.identidadeSecreta = identidadeSecreta;
		this.universo = universo;
		this.grupoLiga = grupoLiga;
		this.superPoderes = superPoderes;
		this.estaNaAtiva = estaNaAtiva;
		
	}
	
	public String getNomeDeVilao () {
		return nomeDeVilao;
	}
	public void setNomeDeVilao(String nomeDeVilao) {
		this.nomeDeVilao = nomeDeVilao;
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
	
	@Override
	public String toString() {
		return 
				    "\nNome: " + nomeDeVilao 
				  + "\nID Secreta: " + identidadeSecreta
				  + "\nEstá na Ativa: " + estaNaAtiva
				  + "\nSuperpoderes: " + superPoderes
			      + "\nUniverso: " + universo
			      + "\nLiga ou Grupo: " + grupoLiga;
	}
	
}

