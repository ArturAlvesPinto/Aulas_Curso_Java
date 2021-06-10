package br.com.treinamento.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import br.com.treinamento.conexao.Conexao;
import br.com.treinamento.interfaces.IUsuario;
import br.com.treinamento.model.Usuario;

// * -- Classe UsucarioDao usa a class Conexao e aplica a interface IUsuario -- * /

public class UsuarioDao extends Conexao implements IUsuario{
	
	// Conexao ao DB. Gerencia conexão.
	Connection conn;
	
	// Defini a estrutura de como será as execuções no DB. **Evita o inject SQL.
	PreparedStatement pstmt;
	
	// Tratamento dos resultados da Query do DB
	ResultSet rs;
	
	// Permiti executar comandos no DB. SELECT, DELETE, etc...
	Statement stmt;
	
	
	public UsuarioDao() throws ClassNotFoundException, SQLException {
		super();
		conn = Conexao.conectar();
	}

	
	// * - Métodos provenientes da interface IUsuario - *
	
	
	//------------------------------ INSERIR ----------------------------------
	
	@Override
	public void inserir(Usuario usuario) throws Exception {
		
		// Defini a escrita SQL que será usada para o Inserir
		String sql = "INSERT INTO Usuario (nome, email, login, senha) VALUES (?, ?, ?, ?)";

		// Defini a construção de como será os parametros SQL usando o PrepareStatement
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, usuario.getNome());
		pstmt.setString(2, usuario.getEmail());
		pstmt.setString(3, usuario.getLogin());
		pstmt.setString(4, usuario.getSenha());

		// Executa a ação SQL montada anteriormente. Retorna um boolean OK, NOTOK binário.
		int inserido = pstmt.executeUpdate();

		// Verifica se foi concluído corretamente a ações, caso seja, envia uma mensagem.
		if (inserido > 0) {
			System.out.println("Usuário Inserido com Sucesso!");
		}
	}

	
	//------------------------------ EXCLUIR ----------------------------------
	
	@Override
	public void excluir(Integer idUsuaio) throws Exception {
			
		// Seguindo a mesma logistica do inserir()
		String sql = "DELETE FROM usuario WHERE id=?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idUsuaio);

		int deletado = pstmt.executeUpdate();
		if (deletado > 0) {
		System.out.println("Usuario deletado com sucesso!");
		}		
	}
	
		
	//------------------------------ ATUALIZAR ----------------------------------

	@Override
	public void atualizar(Usuario usuario, Integer idUsuario) throws Exception {
		
		// Seguindo a mesma logistica do inserir()
		String sql = "UPDATE usuario SET senha=?, login=?, email=? WHERE id=?";

		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(3, usuario.getEmail());
		pstmt.setString(2, usuario.getLogin());
		pstmt.setString(1, usuario.getSenha());
		pstmt.setInt(4, idUsuario);

		int atualizado = pstmt.executeUpdate();

		if (atualizado > 0) {
		System.out.println("Dados Atualizados com Sucesso!");
		}	
	}
	
	
	//------------------------------ LISTAR ----------------------------------

	@Override
	public void listar() throws Exception {
		
		// Seguindo a mesma logistica do inserir()
		String sql = "SELECT * FROM usuario";

		pstmt = conn.prepareStatement("select * from usuario");
		rs = pstmt.executeQuery();

		int count = 0;

		while (rs.next()) {
		String id = rs.getString("id");
		String nome = rs.getString("nome");
		String senha = rs.getString("senha");
		String login = rs.getString("login");
		String email = rs.getString("email");

		System.out.println("\n****************************************");
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Senha: " +senha);
		System.out.println("Login: " +login);
		System.out.println("E-mail: " +email);

		}	
	}	
}
