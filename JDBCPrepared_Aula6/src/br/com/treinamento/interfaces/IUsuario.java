package br.com.treinamento.interfaces;

import br.com.treinamento.model.Usuario;

// CRUD Usu�rio
public interface IUsuario {
	
	public void inserir(Usuario usuario) throws Exception;
	public void excluir(Integer idUsuaio) throws Exception;
	public void atualizar(Usuario usuario, Integer idUsuaio) throws Exception;
	public void listar() throws Exception;

}
