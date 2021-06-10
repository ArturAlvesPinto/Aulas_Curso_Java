package atividadeCarro;

public class Banco {

	private Double preco;
	private String modelo;
	private String fabricante;
	
	public Banco() {

	}

	public Banco(Double preco, String modelo, String fabricante) {
		super();
		this.preco = preco;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Banco [preco=" + preco + ", modelo=" + modelo + ", fabricante=" + fabricante + "]";
	}
			
}
