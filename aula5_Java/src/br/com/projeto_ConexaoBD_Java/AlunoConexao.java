package br.com.projeto_ConexaoBD_Java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AlunoConexao extends Conexao {

	// Se a função estivesse em outra pasta, seria necessário utilizar this.conectar()
	Connection conn = conectar(); 
	// Area de memória que será utilizado para as consultas
	Statement stmt = conn.createStatement();

	
	
	public AlunoConexao() throws ClassNotFoundException, SQLException {
		super();
	}

	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		
		AlunoDao alunoInsert = new AlunoDao();
		
		// Input dos valores
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana Juliana");
		aluno1.setCpf("12365478952");
		aluno1.setTelefone("48 9876-4598");
		
		System.out.println(alunoInsert.createAluno(aluno1) + "\n\n");
		
		
		
		AlunoDao objAlunoDao = new AlunoDao();
		List<Aluno> lista = new ArrayList();
		lista = objAlunoDao.getAll();
		
		for(Aluno aluno: lista) {
			System.out.println("Aluno [");
			System.out.println("Id: "+ aluno.getId());
			System.out.println("Nome: "+ aluno.getNome());
			System.out.println("Telefone: "+ aluno.getTelefone() + "\n]\n");
		}
		
	}

}
