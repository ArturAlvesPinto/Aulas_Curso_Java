package aula1java;

public class EstruturaDecisao {

	public static void main(String[] args) {
		
		Integer valor = 15;
		Boolean acerto = false;
		
		if(valor >20) {
			System.out.println("Vaor � maior que 20");
		}else {
			System.out.println("Valor � menor que 20");
		}
		
		if((valor == 15) || valor < 10 ) {
			System.out.println("Valor � igual a 15 OU � menor que 10");
		}
		if(!acerto) {
			System.out.println("Acerto � uma negacao");
		}
		
		System.out.println( valor >= 16 ? "Valor maior ou igual que 16" : "Valor menor que 16"); // Operador tern�rio

	}

}
