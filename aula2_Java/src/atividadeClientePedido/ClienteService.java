package atividadeClientePedido;

//
public class ClienteService {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(800); // Aqui já é setado o código do cliente.
		
		System.out.println("Aqui o nome do cliente é " + cliente1.getNomeCompleto());
		System.out.println("\nIsso ocorre pois não foi setado o nome do cliente ainda.");
		cliente1.setNomeCompleto("Artur Alves Pinto");
		System.out.println("\nAqui o nome do cliente é " + cliente1.getNomeCompleto());		
	}
}
