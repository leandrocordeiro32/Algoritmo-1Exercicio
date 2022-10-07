package br.com.senai.cronometro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuSistema implements ActionListener {
	JLabel jlab;
	public MenuSistema () {
		
		JFrame jfrm = new JFrame ("JEduk - Gerenciamento de Atividades");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300 , 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criar um rótulo que exibirá a opção feita no menu
		
		jlab = new JLabel();
		
		//Criar a barra de menu
		
		JMenuBar jmb = new JMenuBar();
		
		//Criar o menu
		
		JMenu jmAtividade = new JMenu ("Atividade");
		
		//Criar os itens de menu
		
		JMenuItem jmiInserir = new JMenuItem("Inserir");
		JMenuItem jmiPesquisar = new JMenuItem("Pesquisar");
		JMenuItem jmiAtualizar = new JMenuItem("Atualizar");
		JMenuItem jmiDeletar = new JMenuItem("Deletar");
		
		jmAtividade.add(jmiInserir);
		jmAtividade.add(jmiPesquisar);
		jmAtividade.add(jmiAtualizar);
		jmAtividade.add(jmiDeletar);
		
		jmb.add(jmAtividade);
		
		//Adicionar o menubar ao formulário
		
		jfrm.add(jmb);
		jfrm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

		
}
