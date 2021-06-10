package br.com.projeto_ConexaoBD_Java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/* -- DAO (Data Access Object) => É um padrão de projeto o qual centraliza a camada de conexão com o banco em uma classe -- */

public class AlunoDao extends Conexao {

	Connection conn = conectar();
	Statement stmt = conn.createStatement();
	// ResultSet pega o resultado da Query no BD.
	ResultSet rs = null;

	public AlunoDao() throws ClassNotFoundException, SQLException {
		super();
	}

	public List<Aluno> getAll() throws SQLException {

		List<Aluno> lista = new ArrayList<>();
		// Monta a QUERY a ser realiazda
		String sql = "SELECT id, nome, cpf, telefone FROM aluno";
		
		// Executa a QUERY no BD
		rs = stmt.executeQuery(sql);
		
		// Monta list de exibição para usuário
		while (rs.next()) {
			// Pega valores
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			String cpf = rs.getString("cpf");
			String telefone = rs.getString("telefone");

			// Cria objeto aluno
			Aluno objAluno = new Aluno();
			objAluno.setId(id);
			objAluno.setNome(nome);
			objAluno.setCpf(cpf);
			objAluno.setTelefone(telefone);

			// Adiciona objeto à var lista
			lista.add(objAluno);
		}
		
		// Exibi list montada como resultado
		rs.close();
		conn.close();
		return lista;
	}

	public Aluno createAluno(Aluno obj) throws SQLException {

		// Montagem do comando sql para inserção
		String sql = "INSERT INTO aluno VALUES (null,'" + obj.getNome() + "','" + obj.getCpf() + "','"
				+ obj.getTelefone() + "')";

		stmt.executeUpdate(sql);
		//conn.close();
		System.out.println("Inserção Finalizadaaaaa!");

		return obj;
	}

}
