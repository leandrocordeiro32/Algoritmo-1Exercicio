package br.com.senai.cronometro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws SQLException {
		
		new MenuSistema();
		
		//main + ctrl espaço: cria a public static void main

		/*SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Cronometro();
			}
			
		}
		
		);
		/*Passo a passo de uma conexão
		 * 
		 * Início da conexão*/
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();

		//Fim da conexão
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a atividade: ");
		String descricao = sc.nextLine();
		
		
		//Inserindo no banco
		
		//String sqlInserir = "INSERT INTO atividade(descricao)VALUES(?)";
		PreparedStatement stm = 
				con.prepareStatement("INSERT INTO atividade(descricao)VALUES(?)" , 
						Statement.RETURN_GENERATED_KEYS); //Invasão SQL Injection
		stm.setString(1, descricao);
		stm.execute();
		sc.close();
		//System.out.println("Resultado: " + r);
		
		/*Deletar na tabela
		
		String sqlDeletar = "DELETE FROM atividade WHERE id=4";
		stm.execute(sqlDeletar);*/
		
		/*/Início da Pesquisa
		boolean resultado = stm.execute("SELECT * FROM atividade");
		
		System.out.println("Status da Conexão " + resultado);
		
		ResultSet rs = stm.getResultSet();
		while(rs.next()) {
		Integer id = rs.getInt("id");
		System.out.println(id);
		String descricao = rs.getString("descricao");
		System.out.println(descricao);

		}
		
		//Fim da Pesquisa*/
		
		//Fechar conexão e outras coisas
		System.out.println("Fechando a conexão...");

		//rs.close();
		stm.close();
		con.close();

	}

}
