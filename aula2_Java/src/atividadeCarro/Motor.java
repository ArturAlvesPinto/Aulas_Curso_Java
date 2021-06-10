package atividadeCarro;

public class Motor {

	private Double preco;
	private Integer potencia;
	private String fabricante;
	
	public Motor() {
	
	}

	public Motor(Double preco, Integer potencia, String fabricante) {
		super();
		this.preco = preco;
		this.potencia = potencia;
		this.fabricante = fabricante;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Motor [preco=" + preco + ", potencia=" + potencia + ", fabricante=" + fabricante + "]";
	}
		
}
