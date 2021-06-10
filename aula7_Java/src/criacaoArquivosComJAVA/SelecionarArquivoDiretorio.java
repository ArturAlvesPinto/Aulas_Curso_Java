package criacaoArquivosComJAVA;

import java.io.File;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class SelecionarArquivoDiretorio {

	public static void main(String[] args) {

		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());

		j.setDialogTitle("Abrindo Arquivos em JAVA"); // Título da janela
		j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // traz somente os diretorios

		int ret = j.showOpenDialog(null); // Abri um arquivo
		//int ret = j.showSaveDialog(null); // Salva um arquivo
		
		
		
		if (ret == j.APPROVE_OPTION) {
			File selecionado = j.getSelectedFile();
			System.out.println(selecionado.getAbsolutePath());

			// Aqui é formado um array dos arquivos selecionados e é impresso o nome deles
			File[] arquivos = j.getSelectedFiles();
			Arrays.asList(arquivos).forEach(x -> {
				if (x.isDirectory()) {
					System.out.println(x.getName());
				}

			});
		}
		
		
		
	}

}
