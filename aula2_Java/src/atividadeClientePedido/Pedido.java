package atividadeClientePedido;

//Cria��o da Classe pedido
public class Pedido {

	private Integer codigoPedido;
	private String descricaoPedido;
	private String clienteNome;
	
	//Construtor padr�o
	public Pedido() {
		
	}
	
	// Construtor com todos parametros da class	
	public Pedido(Integer codigoPedido, String descricaoPedido, String clienteNome) {
		super();
		this.codigoPedido = codigoPedido;
		this.descricaoPedido = descricaoPedido;
		this.clienteNome = clienteNome;
	}



	// Getters e Setters
	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDescricaoPedido() {
		return descricaoPedido;
	}

	public void setDescricaoPedido(String descricaoPedido) {
		this.descricaoPedido = descricaoPedido;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	
	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", descricaoPedido=" + descricaoPedido + ", clienteNome="
				+ clienteNome + "]";
	}

	//M�todo modifica o nome do cliente:
	public String upPeido(Pedido pedido, String nomeNovo, String descricaoNova) {
		
		if(pedido.equals(null)) {
			String msgm = "Por favor, informe o pedido que ser� alterado.";
			return msgm;
		}else {
			if(!nomeNovo.isEmpty()) {
				pedido.setClienteNome(nomeNovo);
			}
			if(!descricaoNova.isEmpty()) {
				pedido.setDescricaoPedido(descricaoNova);
			}
			
			String msgm = "As altera��es foram realizadas com sucesso!" +
					"\nPed�do c�digo: " + pedido.getCodigoPedido() +
					"\nNome do cliente: " + pedido.getClienteNome() + 
					"\nDescri��o do pedido: " + pedido.getDescricaoPedido();
			return msgm;
			
		}	
	}
}
