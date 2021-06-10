package atividadesAula1;

import javax.swing.JOptionPane;

//Atividade para calcular número de dias da vida de uma pessoa.
public class atv4 {

	public static void main(String[] args) throws InterruptedException {

		JOptionPane.showMessageDialog(null,"Este processo irá calcular os dias de vida de uma pessoa"
				+ ".\nClick em ok para prosseguir!");

		Integer idadeDias = 0;

		String nome = JOptionPane.showInputDialog("Por favor, informe seu nome:");
		if (nome.isEmpty()) {
			JOptionPane.showMessageDialog(null, "A informação do nome é obrigatoria!");
		} else {
			
			String idade = JOptionPane.showInputDialog("Olá " + nome + "! Informe sua idade:");
			try {
				idadeDias = Integer.parseInt(idade) * 365;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe uma idade válida!");
				throw new InterruptedException();
			}

			if (idadeDias > 0) {

				JOptionPane.showMessageDialog(null, nome + ", você já viveu " + idadeDias + " dias.");

			} else {
				JOptionPane.showMessageDialog(null, "Informe idade maior zero!");
			}
		}
	}

}
