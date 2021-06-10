package aula6_Java;

public class ExemploLoop {

	public static void main(String[] args) {

		// Criando vetores (array):
		// Caso quisesse um vetor bidimensional. Ex: nome[][] = new String[2][3] (2 linhas x 3 colunas)

		String nome[] = new String[5];
		Double salario[] = new Double[5];

		// Populando Array

		nome[0] = "Maria";
		nome[1] = "Joao";
		nome[2] = "Zeze";
		nome[3] = "Creuza";
		nome[4] = "Astolfo";

		salario[0] = 4900.00;
		salario[1] = 6400.48;
		salario[2] = 9500.54;
		salario[3] = 8250.00;
		salario[4] = 10800.00;

		//* Existem duas estruturas de LOOP *

		/*
		 * While : Precisa ter um ponto de parada. Condição de parada é estabelecida no
		 * começo. Preciso criar uma variável interativa para monitoramento.
		 * 
		 */

		int count = 0;
		while (count <= nome.length - 1) {
			System.out.println("* 	Nome " + (count + 1) + " : " + nome[count]);
			System.out.println("*	Salario : " + salario[count]);
			System.out.println("*****");
			count++;
		}

		//****************************************************
		
		// Criando vetor utilizando a classe contato.		
		Contato listaContatos[] = new Contato[3];
		
		// Criando contato.	
		Contato contato0 = new Contato();
		contato0.setNome("Janilda");
		contato0.setTelefone("00 9999-1234");
		contato0.setEmail("nilda@email.com");
		contato0.setEndereco("R. Andorinhas, 23");
		contato0.setPretensaoSalarial(8550.00);
		
		Contato contato1 = new Contato();
		contato1.setNome("Zoraldo");
		contato1.setTelefone("00 4897-3214");
		contato1.setEmail("zoraldinho@email.com");
		contato1.setEndereco("R. MegaFone, 1234");
		contato1.setPretensaoSalarial(6050.00);
		
		Contato contato2 = new Contato();
		contato2.setNome("Germilho");
		contato2.setTelefone("00 1543-9468");
		contato2.setEmail("pipoca@email.com");
		contato2.setEndereco("R. Panelas, 564");
		contato2.setPretensaoSalarial(7800.00);
		
		/*
		 * For : 
		 * Ponto de para já é estabelecido no início, dentro da estrutura.
		 * 
		 */
		
		listaContatos[0] = contato0;
		listaContatos[1] = contato1;
		listaContatos[2] = contato2;
		
		for (int i = 0; i<listaContatos.length ; i++) {
			System.out.println(listaContatos[i]);	
		}
		
		/*
		 *  For :
		 * Outro modo de declarar o for. Percorre todo o vetor declarado, e lança pra dentro do objeto declarado
		 * Neste caso: percorre todos itens de listaContatos e lança em contato.
		 *  
		 */
		
		for (Contato contato : listaContatos) {
			System.out.println("Usando FOR : " + contato);
		}
		
		
		// Percorrendo uma string como array.
		
		String frase = "Hello World";
		for(int i=0; i<frase.length(); i++) {
			System.out.println(frase.charAt(i)); // Dá um console em cada caracter de 'frase'
		}

		
		
	}
}
