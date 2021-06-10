package aula1java;

//Class sem static void main, pois não é executavel
public class Time {
	
	//Atributos possuem tipos de modificador privado.
	private String nome;
	private String estado;
	private String localEstadio;
	private String campeonato;
	private Integer titulos;
	private Integer numJogadores;
	
	
	//Método construtor padrão é publico
	public Time() {
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLocalEstadio() {
		return localEstadio;
	}

	public void setLocalEstadio(String localEstadio) {
		this.localEstadio = localEstadio;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public Integer getTitulos() {
		return titulos;
	}

	public void setTitulos(Integer titulos) {
		this.titulos = titulos;
	}

	public Integer getNumJogadores() {
		return numJogadores;
	}

	public void setNumJogadores(Integer numJogadores) {
		this.numJogadores = numJogadores;
	}
}
