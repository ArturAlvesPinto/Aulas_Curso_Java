package aula2;

public class MedicoOrtopedista extends Medico{
	
	private String tipoOrtopedia;
	private Integer numPacientes;
	
	public MedicoOrtopedista() {

	}

	public String getTipoOrtopedia() {
		return tipoOrtopedia;
	}

	public void setTipoOrtopedia(String tipoOrtopedia) {
		this.tipoOrtopedia = tipoOrtopedia;
	}

	public Integer getNumPacientes() {
		return numPacientes;
	}

	public void setNumPacientes(Integer numPacientes) {
		this.numPacientes = numPacientes;
	}

	@Override
	public String toString() {
		return "MedicoOrtopedista [tipoOrtopedia=" + tipoOrtopedia + ", numPacientes=" + numPacientes + ", getNome()="
				+ getNome() + ", getCrm()=" + getCrm() + "]";
	}
	
}
