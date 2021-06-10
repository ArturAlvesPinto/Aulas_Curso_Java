package aula1java;

public class EstruturaDecisao {

	public static void main(String[] args) {
		
		Integer valor = 15;
		Boolean acerto = false;
		
		if(valor >20) {
			System.out.println("Vaor é maior que 20");
		}else {
			System.out.println("Valor é menor que 20");
		}
		
		if((valor == 15) || valor < 10 ) {
			System.out.println("Valor é igual a 15 OU é menor que 10");
		}
		if(!acerto) {
			System.out.println("Acerto é uma negacao");
		}
		
		System.out.println( valor >= 16 ? "Valor maior ou igual que 16" : "Valor menor que 16"); // Operador ternário

	}

}
