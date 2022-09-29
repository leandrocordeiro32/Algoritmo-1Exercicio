package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo07 {
	
	private int numero;
	
	public void imprimaNumeros() {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro.", 
				"SENAI Taguatinga", 3));
		
		JOptionPane.showMessageDialog(null, "O número que antecede " + numero + " é " + (--numero) +
				"." + "\nO sucessor é " + (numero + 2) + ".", "SENAI Taguatinga", 1);
	}

}
