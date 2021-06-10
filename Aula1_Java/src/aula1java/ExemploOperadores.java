package aula1java;

public class ExemploOperadores {

	public static void main(String[] args) {
	
		//OPERADORES LÓGICOS
		Integer zeros = 0000; //Operador = de atribuicao
		System.out.println( "Os valores são iguais ? "+ (zeros == 0)); //Operador == se é igual
		System.out.println( "Os valores são diferentes ? "+ (zeros != 0)); //Operador != se é diferente
		
		
		String frase = "\nComecei e ";
		frase += "concatenei";
		System.out.println(frase); // Variavel recebe ela mesma mais alguma coisa
		
		System.out.println("\nMostrando resto da divisão = "+ (10 % 3)); // mostra o resto da divisão entre dois numeros
		
		Integer valor = 10;
		System.out.println("\nValor = "+valor);
		System.out.println("Incremento valor++ = "+ (++valor)); // primeiro acresenta depois mostra
		System.out.println("Valor = "+valor);
		System.out.println("Incremento ++valor "+ (valor++)); // primeiro mostra depois acrescenta
		System.out.println("Valor = "+valor);
	}

}
