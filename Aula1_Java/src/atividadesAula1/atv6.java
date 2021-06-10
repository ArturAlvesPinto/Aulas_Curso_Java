package atividadesAula1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Atividade para calcular o valor R$ por Kg do prato.
public class atv6 {

	public static Double isValid(String param) throws InterruptedException {

		Double valorDoub = 0.0;
		try {
			valorDoub = (Double.parseDouble(param));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe número válido! Use \".\" para separar casas decimais.");
			throw new InterruptedException();
		}
		return valorDoub;
	}
	
	public static void main(String[] args) throws InterruptedException {
		JOptionPane.showMessageDialog(null,
				"Este processo irá calcular o preço (R$) da refeição de acordo com seu peso (g)"
						+ ".\nClick em ok para prosseguir!");

		DecimalFormat arred = new DecimalFormat("#0.00");
		Double kilo = 12.0;

		String prato = JOptionPane.showInputDialog("Por favor, informe o peso do seu prato em gramas (g):");
		Double peso = isValid(prato);

		if (peso > 0) {

			Double valor = peso*kilo/1000;
			JOptionPane.showMessageDialog(null, "Sua refeição custará: R$ " + arred.format(valor)  + " reais."
					+ "\nPreço do quilo (Kg) = " + arred.format(kilo));

		} else {
			JOptionPane.showMessageDialog(null, "O peso do prato precisa ser maior que zero!");
		}

	}

}
