package criacaoArquivosComJAVA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public static void main(String[] args) throws IOException{
		
		// Acessando um arquivo que eu sei q existe
		File arq = new File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7\\arq_02.txt"); 
		
		// Le o arquivo apontado
		FileReader fr = new FileReader(arq);
		BufferedReader bf = new BufferedReader(fr);

		// Percorre o arquivo mostrando as linhas
		while (bf.ready()) {
			System.out.println(bf.readLine());
		}
		
		fr.close();
		bf.close();
		
	}

}
