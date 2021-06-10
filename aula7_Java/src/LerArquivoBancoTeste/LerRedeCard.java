package LerArquivoBancoTeste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerRedeCard {

	public static void main(String[] args) throws IOException {

		File arq = new File("C:\\Users\\artur\\Desktop\\Curso JAVA\\Aula_7\\Arquivo_RedeCard.txt");

		FileReader fr = new FileReader(arq);
		BufferedReader bf = new BufferedReader(fr);

		RedeCard030 header1;
		List<RedeCard030> lista030 = new ArrayList<RedeCard030>();

		while (bf.ready()) {

			String linha = bf.readLine();
			String tipoLinha = linha.substring(0, 3);

			header1 = new RedeCard030();

			if (tipoLinha.equals("030")) {

				// Pegando informações do arquivo

				header1.setTipoRegistro(tipoLinha);
				header1.setData(linha.substring(3, 11));
				header1.setOperadora(linha.substring(11, 19));
				header1.setTipoArquivo(linha.substring(19, 53));
				header1.setNomeComercial(linha.substring(53, 75));
				header1.setSequencial(linha.substring(75, 81));
				header1.setMatriz(linha.substring(81, 90));
				header1.setTipoProcessamento(linha.substring(90, 105));
				header1.setVersaoArquivo(linha.substring(105, 125));

				// Adiciona as informações em uma lista
				lista030.add(header1);

			} else if (tipoLinha.equals("032")) {
				System.out.println("\nLinha 032: " + linha + "\n");

			} else if (tipoLinha.equals("034")) {
				System.out.println("Inf: " + linha);
			}

		}

		for (RedeCard030 obj030 : lista030) {
			System.out.println("\n\n" + obj030);
		}

		fr.close();
		bf.close();

	}

}
