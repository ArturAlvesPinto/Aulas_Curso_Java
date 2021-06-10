package aula2;

public class MedicoCirurgiao extends Medico{
	
	// GENERIZACAO x ESPECIALIZACAO (Conceito de Heran�a)
	//Neste caso esta classe � uma extensao da class M�dico, por isso a chamada Extends no nome.
	//Aqui podemos especificar mais os paramentros
	
	private String tipoCirurgia;
	private Integer qtdCirurgia;
	
	public MedicoCirurgiao() {

	}

	public String getTipoCirurgia() {
		return tipoCirurgia;
	}

	public void setTipoCirurgia(String tipoCirurgia) {
		this.tipoCirurgia = tipoCirurgia;
	}

	public Integer getQtdCirurgia() {
		return qtdCirurgia;
	}

	public void setQtdCirurgia(Integer qtdCirurgia) {
		this.qtdCirurgia = qtdCirurgia;
	}

	// No to string tem que dar um get para pegar os atributos herdados
	@Override
	public String toString() {
		return "MedicoCirurgiao [tipoCirurgia=" + tipoCirurgia + ", qtdCirurgia=" + qtdCirurgia + ", getNome()="
				+ getNome() + ", getCrm()=" + getCrm() + "]";
	}
	
}
