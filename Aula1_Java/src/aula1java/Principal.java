package aula1java;
/**
 * 
 * @author artur
 *
 * Este � um coment�rio java doc, que � acrescentado a um HTML 
 * sautomaticamente na hora de documentar o projeto
 *
 */
public class Principal {

	public static void main(String[] args) {
		System.out.println("Primeira class em Java");//Imprime no console
		System.out.print("Outra linha ?");
		System.out.println(" S� se tiver o ln"); //O ln quebra a linha
		
		String nome = "Artur Alves";
		Integer idade = 26;
		char sexo = 'M'; //Pode ter um �nico caracter
		
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		
		
	}
}
