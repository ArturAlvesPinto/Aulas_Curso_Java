package aula1java;

public class ExemploOperadores {

	public static void main(String[] args) {
	
		//OPERADORES L�GICOS
		Integer zeros = 0000; //Operador = de atribuicao
		System.out.println( "Os valores s�o iguais ? "+ (zeros == 0)); //Operador == se � igual
		System.out.println( "Os valores s�o diferentes ? "+ (zeros != 0)); //Operador != se � diferente
		
		
		String frase = "\nComecei e ";
		frase += "concatenei";
		System.out.println(frase); // Variavel recebe ela mesma mais alguma coisa
		
		System.out.println("\nMostrando resto da divis�o = "+ (10 % 3)); // mostra o resto da divis�o entre dois numeros
		
		Integer valor = 10;
		System.out.println("\nValor = "+valor);
		System.out.println("Incremento valor++ = "+ (++valor)); // primeiro acresenta depois mostra
		System.out.println("Valor = "+valor);
		System.out.println("Incremento ++valor "+ (valor++)); // primeiro mostra depois acrescenta
		System.out.println("Valor = "+valor);
	}

}
