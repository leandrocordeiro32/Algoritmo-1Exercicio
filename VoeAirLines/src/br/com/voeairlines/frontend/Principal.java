package br.com.voeairlines.frontend;

import br.com.voeairlines.dao.*;
import br.com.voeairlines.entities.*;
import br.com.voeairlines.bo.*;
import javax.swing.*; //https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html

public class Principal {

	public static void main(String[] args) {
		
		//Declaração de um objeto
		ClienteBO cbo = new ClienteBO();
		
		//Declaração de uma variável primitiva
		int idade;
		//Declaração de uma variável de referência
		String leiaIdade;
		
		//Entrada de dados
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade: ");
		
		//Conversão de String pra int
		idade = Integer.parseInt(leiaIdade); 
		
		JOptionPane.showMessageDialog(null, cbo.validaIdade(idade));

		/* Depois de criar o package BO, a Class ClientBO e a Interface, esse código foi mudado
		//Passo 1: Declarar uma variável inteira.
		int idade; //O cálculo entende o int.
		
		//Passo 2: Declarar uma variável String
		String leiaIdade; //A tela entende String.
		
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade: ");
		
		//Classes Wrappers ... converter String em int.
		idade = Integer.parseInt(leiaIdade);
		
		//Regra de Negócio que vai pra Interface
		if(idade < 18) {
			JOptionPane.showMessageDialog(null , 
					"Embarque Não Autorizado" , 
					"VoeAirLines" , 
					JOptionPane.ERROR_MESSAGE);
		} else {
			
			JOptionPane.showMessageDialog(null , 
					"Embarque Autorizado. Boa Viagem!" , 
					"VoeAirLines" , 
					JOptionPane.INFORMATION_MESSAGE);
		}
				

		
		Aeronave aeronave = new Aeronave("Embraery" , "Bandeirante" , "EMB-100");
		AeronaveDAO aeronaveDAO = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aeronave));
		
		Manutencao manutencao = new Manutencao("Comunicação e Navegação" , 
				"Manutenção dos sistemas de Rádio Comunicação e Navegação");
		System.out.println(new ManutencaoDAO().cadastrarManutencao(manutencao)); */
	}

}
