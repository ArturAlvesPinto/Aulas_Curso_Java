package criacaoArquivosComJAVA;

import java.io.File;

public class RenomearArquivo {

	public static void main(String[] args) {
		
		
		File dir = new File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7");
		File arq = new File(dir, "arq_01.txt");
		File arq2 = new File(dir, "arq_renomeado.txt");
		
		boolean statusRename = arq.renameTo(arq2);

		System.out.println("Renomeado: "+ arq +" -> New Name: " + arq2);
		
	}

}
