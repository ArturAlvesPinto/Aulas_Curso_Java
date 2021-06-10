package br.com.animais;

public class Animal2 implements IAnimal {

	@Override
	public String andar() {
		return "Walk";
	}

	@Override
	public String velocidadeCorrida(Double velocidade) {
		return velocidade.toString();
	}

	@Override
	public String comer() {
		return "Comer";
	}	
}
