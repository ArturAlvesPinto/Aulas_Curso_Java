package atividadesAula1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

//Atividade para calcular o valor R$ litros de gasolina por total pago.
public class atv5 {

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
				"Este processo irá calcular a quantidade de litros de gasolina por valor pago"
						+ ".\nClick em ok para prosseguir!");

		DecimalFormat arred = new DecimalFormat("#0.00");

		String preco = JOptionPane.showInputDialog("Por favor, informe o preço da gasolina por litro:");
		Double gasolina = isValid(preco);

		if (gasolina > 0) {

			String pagamento = JOptionPane.showInputDialog("Olá! Informe quantos reais você desaja pagar:");
			Double reais = isValid(pagamento);
			if (reais > 0) {
				Double litro = reais/gasolina;
				JOptionPane.showMessageDialog(null, "Você acaba de abastecer "+ arred.format(litro) +" litros");
			} else {
				JOptionPane.showMessageDialog(null, "Seu valor de pagamento precisa ser maior que zero!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "O preço da gasolina precisa ser maior que zero!");
		}
	}
}
