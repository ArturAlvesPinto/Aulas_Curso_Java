package projeto1505;

import br.com.interfaces.IPessoa;

public class PessoaJuridica extends Pessoa implements IPessoa{

	private String cnpj;
	private String tipoPJ;
	private String telefoneComercial;

	public PessoaJuridica() {

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoPJ() {
		return tipoPJ;
	}

	public void setTipoPJ(String tipoPJ) {
		this.tipoPJ = tipoPJ;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", tipoPJ=" + tipoPJ + ", telefoneComercial=" + telefoneComercial
				+ ", getNome()=" + getNome() + ", getId()=" + getId() + ", getTelefone()=" + getTelefone() + "]";
	}

	public Double calcularSalario() {
		return 3000.00 * 4;
	}
}
