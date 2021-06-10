package br.com.animais;

public class Animal implements IAnimal{

	@Override
	public String andar() {
		return "NotWalk";
	}

	@Override
	public String velocidadeCorrida(Double velocidade) {
		return velocidade.toString();
	}

	@Override
	public String comer() {
		return "Feijão";
	}
	
}
