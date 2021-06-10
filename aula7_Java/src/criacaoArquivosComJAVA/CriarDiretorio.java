package criacaoArquivosComJAVA;

import java.io.IOException;

public class CriarDiretorio {

	public static void main(String[] args) {
		
		
		java.io.File diretorio = new java.io.File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7");
		
		boolean statusDir = diretorio.mkdir();
		
		System.out.println(statusDir); // Verifica se foi criado ou não		
		System.out.println(diretorio.getAbsolutePath()); // Pega o caminho absoluto do diretório
		
		
		java.io.File arquivo = new java.io.File(diretorio, "arq_01.txt");
		
		
		try {
			
			boolean statusArq = arquivo.createNewFile();
			System.out.println(statusArq); // Verifica se foi criado ou não
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
