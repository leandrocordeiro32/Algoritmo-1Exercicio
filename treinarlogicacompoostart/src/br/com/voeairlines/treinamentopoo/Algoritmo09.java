package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo09 {
	
	private int numero1 , numero2;
	
	public void imprimaSoma() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro: ", "SENAI Taguatinga", 3));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número inteiro: ", "SENAI Taguatinga", 3));
	
		JOptionPane.showMessageDialog(null, "A soma dos números " + numero1 + " e " + numero2 +
				" é igual a " + (numero1 + numero2) + ".", "SENAI Taguatinga", 1);
	}

}
