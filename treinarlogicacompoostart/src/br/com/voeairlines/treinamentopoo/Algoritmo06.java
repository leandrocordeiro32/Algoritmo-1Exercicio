package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo06 {

	private int numero1 , numero2;
	
	public void imprimaNumero() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe um número inteiro:" , "SENAI Taguatinga" , 1));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe outro número inteiro:" , "SENAI Taguatinga" , 1));
		
		JOptionPane.showMessageDialog(null, "Os números escolhidos foram " + numero1 + " e " 
				+ numero2, "SENAI Taguatinga", 1);
	}

}
