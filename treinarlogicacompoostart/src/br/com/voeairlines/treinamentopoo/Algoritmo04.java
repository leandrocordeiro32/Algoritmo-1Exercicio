package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo04 {
	
	private double media;
	
	public void imprimeMedia() {
		
		media = (8 + 9 + 7) / 3;
		
		JOptionPane.showMessageDialog(null, "A média de 8 , 9 e 7 é igual a " + media,
				"SENAI Taguatinga", 1);
	}

}
