package atividadeClientePedido;

// Instanciando dois objetos na class string
public class PedidoService {

	public static void main(String[] args) {

		Pedido cliente1 = new Pedido();
		cliente1.setCodigoPedido(123);
		cliente1.setClienteNome("Jo�o Jair");
		cliente1.setDescricaoPedido("Shampo para carecas");
		
		System.out.println("Ol� " + cliente1.getClienteNome() + "!\nSeu pedido " + cliente1.getCodigoPedido()
				+ " j� foi realizado!" + "\nDescri��o: " + cliente1.getDescricaoPedido() + "\n");
		
		//teste atualiz��o do descri��o
		String msgm = cliente1.upPeido(cliente1, "", "Shampoo para cabelos");
		System.out.println(msgm + "\n");
		

		Pedido cliente2 = new Pedido();
		cliente2.setCodigoPedido(456);
		cliente2.setClienteNome("Maria Morria");
		cliente2.setDescricaoPedido("Escova para dente");
		
		System.out.println("Ol� " + cliente2.getClienteNome() + "!\nSeu pedido " + cliente2.getCodigoPedido()
				+ " j� foi realizado!" + "\nDescri��o: " + cliente2.getDescricaoPedido() + "\n");
		
		//teste atualiz��o do nome
		String msgm2 = cliente2.upPeido(cliente2, "Maria Antonieta", "");
		System.out.println(msgm2 + "\n");
	}

}
