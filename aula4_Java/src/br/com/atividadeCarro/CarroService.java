package br.com.atividadeCarro;

public class CarroService {

	public static void main(String[] args) {

		Carro car1 = new Carro();
		car1.setAno(2020);
		car1.setCor("Preto");
		car1.setModelo("BMW");
		car1.setNovo(true);
		car1.setNumPortas(4);

		System.out.println("Preço do carro " + car1.getModelo() + " " + car1.getAno() + " da cor " + car1.getCor()
				+ " = " + "R$ " + car1.retornaPreco(car1.getNumPortas(), car1.getAno()));
		System.out.println("Número máximo de parcelas = " + car1.calculaNumeroParcelasMaximo());
	}
}
