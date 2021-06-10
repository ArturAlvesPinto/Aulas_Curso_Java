package br.com.projeto_ConexaoBD_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	
	/* --- Definição de constantes --- */
	
	// Classe de conexao jdbc
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// Local/Endereço onde o BD é hospedado
	static final String DB_URL = "jdbc:mysql://localhost/java_sabado";
	// Usauário do BD (root é o padrão)
	static final String USER = "root";
	// Senha de conexão (caso seja definida)
	static final String PASS = "";

	static Connection conn = null;

	
	public Conexao() throws ClassNotFoundException, SQLException {

		// Classe de conexão será utilizada
		Class.forName("com.mysql.jdbc.Driver");
		// Parametros para conexão (url, user, pass)
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}

	public static Connection conectar() {
		// Método para testar a conexão - Retorna a conexão - Será usado nas outras classes.
		return conn;

	}
}