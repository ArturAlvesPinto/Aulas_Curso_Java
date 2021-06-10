package aula2;

public class Veiculo {

	private String modelo;
	private String cor;
	private String placa;
	private String motorista;
	private Integer ano;
	private String tipoCambio; // Não está sendo passado pois não tem um metodo public associado a este atributo.
	public Integer qtdPortas; //public pode ser acessado sem ter que criar método. Não deve ser usado assim.
	
	
	//POde ser criado vários construtores de maneiras diferentes, para chamadas personalizadas. Exemplo abaixo:
	public Veiculo() {
		// Se for setado os valores aqui eles são chamado como 'padrão' quando o construtor é acionado. Não ideal.
		modelo = "Ferrari";
		cor = "vermelha";
		placa = "HTR-6547";
		ano = 2020;
		qtdPortas = 2;
		
	}
	
	// sobrecargas de constructor -  neste caso tem um construtor onde é possível passar os parametros.
	public Veiculo(String modelo, String cor, String placa, String motorista, Integer ano, String tipoCambio,
			Integer qtdPortas) {
		super(); // Faz referencia ao metodo construtor Object (Class da extrutura da linguagem)
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.motorista = motorista;
		this.ano = ano;
		this.tipoCambio = tipoCambio;
		this.qtdPortas = qtdPortas;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", cor=" + cor + ", placa=" + placa + ", motorista=" + motorista + ", ano="
				+ ano + ", tipoCambio=" + tipoCambio + ", qtdPortas=" + qtdPortas + "]";
	}

}

