package aula2;

public class MedicoFono extends Medico{

	private String turno;
	private String tempoTrabalho;
	static Integer qtdHosprtaisTrabalhdos; // Este � um exemplo de declara��o de um atributo static
	
	public MedicoFono() {

	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTempoTrabalho() {
		return tempoTrabalho;
	}

	public void setTempoTrabalho(String tempoTrabalho) {
		this.tempoTrabalho = tempoTrabalho;
	}
	
	public static Integer getQtdHosprtaisTrabalhdos() {
		return qtdHosprtaisTrabalhdos;
	}

	public static void setQtdHosprtaisTrabalhdos(Integer qtdHosprtaisTrabalhdos) {
		MedicoFono.qtdHosprtaisTrabalhdos = qtdHosprtaisTrabalhdos;
	}

	//Voc� vai notar que o atributo static n�o aparece no toString. Pois como o atributo pertence a class ele n�o precisa de m�todo.
	@Override
	public String toString() {
		return "MedicoFono [turno=" + turno + ", tempoTrabalho=" + tempoTrabalho + ", getNome()=" + getNome()
				+ ", getCrm()=" + getCrm() + "]";
	}

}
