package aula3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class NotaProvaService {

	public static void main(String[] args) {

		DecimalFormat arred = new DecimalFormat("#0.00");
		NotaProva objMedia = new NotaProva();
		String msgmComplete = "";
		Integer qtdMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas médias vc vai calcular: "));

		for (int i = 1; i <= qtdMedia; i++) {

			objMedia.setNota1(
					Double.parseDouble(JOptionPane.showInputDialog("MEDIA " + i + ":\nInforme a nota da Prova 1:")));
			objMedia.setNota2(
					Double.parseDouble(JOptionPane.showInputDialog("MEDIA " + i + ":\nInforme a nota da Prova 2:")));
			objMedia.setNota3(
					Double.parseDouble(JOptionPane.showInputDialog("MEDIA " + i + ":\nInforme a nota da Prova 3:")));

			Double decimalArit = objMedia.MediaAritimetrica();
			Double decimalPond = objMedia.MediaPonderada();

			String msgm = ("\nMédia " + i + ":\n	Media Aritimétrica das Notas: " + arred.format(decimalArit))
					+ ("\n	Média Ponderada das Notas: " + arred.format(decimalPond) + "\n");
			msgmComplete = msgmComplete + msgm;
		}

		JOptionPane.showMessageDialog(null, msgmComplete);

	}

}
