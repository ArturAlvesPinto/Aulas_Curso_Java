package aula3;

public class NotaProva {

	private Double nota1;
	private Double nota2;
	private Double nota3;

	public NotaProva() {

	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double MediaAritimetrica() {

		Double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	public Double MediaPonderada() {

		Double media = (nota1 * 1 + nota2 * 2 + nota3 * 3) / 6;
		return media;
	}

}
