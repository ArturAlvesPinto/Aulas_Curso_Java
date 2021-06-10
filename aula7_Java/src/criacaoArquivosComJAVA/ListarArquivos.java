package criacaoArquivosComJAVA;

import java.io.File;

public class ListarArquivos {

	public static void main(String[] args) {


		File files = new File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7"); // Acessa o diretório
		for (File file : files.listFiles()) {
			System.out.println(file); // Percorre o conteudo do diretório e imprimi o nomes dos arquivos existentes
		}
	
	}

}
