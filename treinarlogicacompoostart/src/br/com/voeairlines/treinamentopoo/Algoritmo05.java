package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo05 {

	private int numero;
	
	public void imprimaNumero() {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um número inteiro:" , "SENAI Taguatinga" , 1));
		JOptionPane.showMessageDialog(null, "O número escolhido foi " + numero, "SENAI Taguatinga", 1);
	}
	

}
