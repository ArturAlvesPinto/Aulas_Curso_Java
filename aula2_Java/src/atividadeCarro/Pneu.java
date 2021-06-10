package atividadeCarro;

public class Pneu  {
	private Double preco;
	private String tipo;
	private String fabricante;
	
	public Pneu() {
	
	}

	public Pneu(Double preco, String tipo, String fabricante) {
		super();
		this.preco = preco;
		this.tipo = tipo;
		this.fabricante = fabricante;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Banco [preco=" + preco + ", tipo=" + tipo + ", fabricante=" + fabricante + "]";
	}

}
