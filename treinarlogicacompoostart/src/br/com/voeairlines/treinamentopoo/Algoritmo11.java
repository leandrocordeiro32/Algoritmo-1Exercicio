package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo11 {

	private double numero , fracao;
	
	public void tercaParte() {
		
		numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número qualquer: ",
				"SENAI Taguatinga", 3));
		
		fracao = numero / 3;
		
		JOptionPane.showMessageDialog(null, "A terça parte do número " + numero + " é igual a " +
		fracao + ".", "SENAI Taguatinga", 1);
	}
}
