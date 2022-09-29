package br.com.voeairlines.treinamentopoo;

import javax.swing.JOptionPane;

public class Algoritmo08 {
	
	private String nome , endereco , telefone;
	
	public void imprimeDados() {
		
		nome = JOptionPane.showInputDialog(null, "Informe o nome: ", "SENAI Taguatinga" , 3);
		endereco = JOptionPane.showInputDialog(null, "Informe o endereço: ", "SENAI Taguatinga" , 3);
		telefone = JOptionPane.showInputDialog(null, "Informe o telefone: ", "SENAI Taguatinga" , 3);

		JOptionPane.showMessageDialog(null, "NOME: " + nome + "\nENDEREÇO: " + endereco +
				"\nTELEFONE: " + telefone, "SENAI Taguatinga", 1);
	}

}
