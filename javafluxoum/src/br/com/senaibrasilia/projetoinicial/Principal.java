package br.com.senaibrasilia.projetoinicial;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		Login login = new Login("SENAI BRASÍLIA - Java");
		login.setVisible(true);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int[] numeros = new int[4];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		
		double soma = 0.0;
		double media = 0.0;
		
		for (int i = 0 ; i < 4 ; i++) {
			//System.out.println(i); //índice
			//System.out.println(numeros[i]); //vetor [i] - indexado a i
			soma += numeros[i];
			media = soma / numeros.length;
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + media);
	
	}

}
