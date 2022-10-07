package br.com.senai.cronometro;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * 
 * @author Leandra
 * @category Desktop Development
 * @version 1
 *
 */

public class Cronometro implements ActionListener {
	
	JLabel jlab;
	long start; //contem a hora inicial em milissegundos
	
	//Criando os dois botões
	JButton btnStart = new JButton("Start");
	JButton btnStop = new JButton("Stop");
	
	public Cronometro () {
		//Criar um conteiner JFrame
		//Um componente que pode receber outro componente
		JFrame jfrm = new JFrame("JEDUK");
		
		//Instanciando o JLabel
		jlab = new JLabel("Pressione Start para iniciar o tempo");
		
		//Adicionar os ouvintes de ação
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		//Especificar FlowLayout como gerenciador de leiaute
		jfrm.setLayout(new FlowLayout());
		//Adicionar os componentes dentro do conteiner
		jfrm.add(btnStart);
		jfrm.add(btnStop);
		jfrm.add(jlab);
		//Fornecer um tamanho inicial para o quadro (frame)
		jfrm.setSize(230 , 90);
		jfrm.setVisible(true);
		//Encerrar quando o usuário fechar o aplicativo
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Passo 1 - Obter a hora atual do sistema
		Calendar calendar = Calendar.getInstance();
		// Passo 2 - Armazenar a hora inicial
		if(e.getActionCommand().equals("Start")) {
			
			start = calendar.getTimeInMillis();
			jlab.setText("Cronômetro está em execução!");
		
		} else {
			
			//Passo 3 - Calcular o tempo decorrido
			jlab.setText("O tempo decorrido foi: " 
			+ (double) (calendar.getTimeInMillis() - start)/1000);
		}
		
		
		
	}

}
