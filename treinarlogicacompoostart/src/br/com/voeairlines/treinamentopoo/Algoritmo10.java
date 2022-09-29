package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo10 {

	private int numero1 , numero2 , produto;
	
	public void imprimaProduto() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro: ",
				"SENAI Taguatinga", 3));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe outro número inteiro: ",
				"SENAI Taguatinga", 3));
		
		produto = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "O produto dos números " + numero1 + " e " + numero2 +
				" é igual a " + produto, "SENAI Taguatinga", 1);
		
		
	}
}
