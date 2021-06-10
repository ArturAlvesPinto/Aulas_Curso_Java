package br.com.projeto_ConexaoBD_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	
	/* --- Defini��o de constantes --- */
	
	// Classe de conexao jdbc
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// Local/Endere�o onde o BD � hospedado
	static final String DB_URL = "jdbc:mysql://localhost/java_sabado";
	// Usau�rio do BD (root � o padr�o)
	static final String USER = "root";
	// Senha de conex�o (caso seja definida)
	static final String PASS = "";

	static Connection conn = null;

	
	public Conexao() throws ClassNotFoundException, SQLException {

		// Classe de conex�o ser� utilizada
		Class.forName("com.mysql.jdbc.Driver");
		// Parametros para conex�o (url, user, pass)
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	public static Connection conectar() {
		// M�todo para testar a conex�o - Retorna a conex�o - Ser� usado nas outras classes.
		return conn;

	}
}