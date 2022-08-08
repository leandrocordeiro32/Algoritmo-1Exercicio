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

	}

