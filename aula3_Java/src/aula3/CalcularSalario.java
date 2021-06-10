package aula3;

public class CalcularSalario {
	
	private Double salario;
	private Double taxa;

	
	public CalcularSalario() {
		
	}


	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	// cria��o de m�tido, o qual n�o tem retorno (void)
	public void salarioCalculado() {
		
		Double resultado = salario + (salario*taxa/100);
		System.out.println("O valor do sal�rio � " + resultado);
	}
	
	// cria��o de m�todo, o qual tem retorna (Double)
	public Double salarioCalculadoComRetorno() {
		
		Double resultado = salario + (salario*taxa/100);
		return resultado;
	
	}
}




