package criacaoArquivosComJAVA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverArquivo {

	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7");
		File arq = new File(dir, "arq_02.txt");
		
		try {
			arq.createNewFile();			
		} catch (IOException e){
			e.printStackTrace();
		}
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(arq, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		printWriter.println("Nova Linha 00");
		printWriter.println("Nova Linha 01");
		printWriter.println("Nova Linha 02");
		printWriter.println("Nova Linha 03");
		
		printWriter.flush();
		printWriter.close();

	}

}
