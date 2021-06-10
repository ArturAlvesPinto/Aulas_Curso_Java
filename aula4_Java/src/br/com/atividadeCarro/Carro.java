package br.com.atividadeCarro;

public class Carro implements ICarro{
	
	private String modelo;
	private Integer numPortas;
	private String cor;
	private Boolean novo;
	private Integer ano;
	
	public Carro() {
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(Integer numPortas) {
		this.numPortas = numPortas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", numPortas=" + numPortas + ", cor=" + cor + ", novo=" + novo + ", ano="
				+ ano + "]";
	}

	
	@Override
	public Double retornaPreco(Integer numPortas, Integer ano) {
			
		return numPortas*500 + ano*0.4 + ano*100/numPortas;
	}

	@Override
	public Integer calculaNumeroParcelasMaximo() {
		
		Double preco = retornaPreco(getNumPortas(),getAno());
		
		if(preco > 5000.00){
			return 36;
		}else {
			return 24;
		}
	}
}
