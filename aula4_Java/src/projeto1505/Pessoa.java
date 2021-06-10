package projeto1505;

public class Pessoa {
	
	private String nome;
	private Integer id;
	private String telefone;
		
	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", id=" + id + ", telefone=" + telefone + "]";
	}
	
	public Double calcularSalario() {
		return 10.00;
	}
	
}



