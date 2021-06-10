package aula1java;

//Class sem static void main, pois não é executavel
public class Jogador {
	
	//Atributos possuem tipos de modificador privado.
	private String nome;
	private Double altura;
	private Double peso;
	private String posicao;
	
	//Método construtor padrão é publico
	public Jogador() {
		
	}

	//Get e Set para acessar os atributos privados	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	// com este método to string você pode fazer a vizualisação de dados de maneira direta.
	@Override
	public String toString() {
	return "Jogador [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", posicao=" + posicao + "]";
	}
}
