package projeto1505;

import br.com.interfaces.IContatos;
import br.com.interfaces.IPessoa;


//PessoaFisica extende de Pessoa e implementa a interface.
// Se voce chama uma interface voc� � obrigado a utilizar os m�todos l� declarados.
// � poss�vel chamar mais de uma interface.

public class PessoaFisica extends Pessoa implements IPessoa, IContatos{

	private String cpf;

	public PessoaFisica() {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getNome()=" + getNome() + ", getId()=" + getId() + ", getTelefone()="
				+ getTelefone() + "]";
	}
	
	public Double calcularSalario() {
		return 5000.00;
	}

	public String retornarContatos() {	
		return getTelefone();
	}
}
