package atividadeClientePedido;

//Criação da Classe pedido
public class Pedido {

	private Integer codigoPedido;
	private String descricaoPedido;
	private String clienteNome;
	
	//Construtor padrão
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

	//Método modifica o nome do cliente:
	public String upPeido(Pedido pedido, String nomeNovo, String descricaoNova) {
		
		if(pedido.equals(null)) {
			String msgm = "Por favor, informe o pedido que será alterado.";
			return msgm;
		}else {
			if(!nomeNovo.isEmpty()) {
				pedido.setClienteNome(nomeNovo);
			}
			if(!descricaoNova.isEmpty()) {
				pedido.setDescricaoPedido(descricaoNova);
			}
			
			String msgm = "As alterações foram realizadas com sucesso!" +
					"\nPedído código: " + pedido.getCodigoPedido() +
					"\nNome do cliente: " + pedido.getClienteNome() + 
					"\nDescrição do pedido: " + pedido.getDescricaoPedido();
			return msgm;
			
		}	
	}
}
