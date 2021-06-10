package atividadeClientePedido;


//Criação da classe cliente. Com o código cliente sendo instanciado no construtor.
public class Cliente {
	
	private Integer condigoCliente;
	private String nomeCompleto;
	
	public Cliente(Integer condigoCliente) {
		super();
		this.condigoCliente = condigoCliente;
	}

	public Integer getCondigoCliente() {
		return condigoCliente;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	@Override
	public String toString() {
		return "Cliente [condigoCliente=" + condigoCliente + ", nomeCompleto=" + nomeCompleto + "]";
	}
	
	
}
