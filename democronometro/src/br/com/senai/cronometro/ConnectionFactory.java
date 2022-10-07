package br.com.senai.cronometro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String url = "jdbc:mysql://localhost/jeduk?useTimeZone=true&serverTimezone=UTC";
	String user = "root";
	String password = "#Marilyn666";
	Connection con;
	
	public Connection recuperarConexao() {
		try {
			
			con = DriverManager.getConnection(url , user , password);
		
		} catch (SQLException ex) {
			
			ex.printStackTrace();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		return con;
		
	}
	

}
