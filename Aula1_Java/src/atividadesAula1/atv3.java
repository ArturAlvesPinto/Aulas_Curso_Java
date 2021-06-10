package atividadesAula1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

// Calcular pre�o pelos n� de produtos comprados e fazendo c�lculo da reserva
public class atv3 {

	public static void main(String[] args) throws InterruptedException {
	
		JOptionPane.showMessageDialog(null, "Este processo ir� calcular as vendas de p�es e broas de uma padaria"
				+ ".\nClick em ok para prosseguir!");
		
		Double paoPreco = 0.12;
		Double broaPreco = 1.50;
		
		String qtdPao = JOptionPane.showInputDialog("Informe o n�mero de p�es vendidos:");
		try {
			paoPreco = Integer.parseInt(qtdPao)*paoPreco;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero inteiro valido!");
			throw new InterruptedException();
			
		}
		
		String qtdBroa = JOptionPane.showInputDialog("Informe o n�mero de broas vendidos:");
		try {
			broaPreco = Integer.parseInt(qtdBroa)*broaPreco;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero inteiro valido!");
			throw new InterruptedException();
			
		}
		
		if (paoPreco >= 0 && broaPreco >= 0) {
			
			DecimalFormat arred = new DecimalFormat("#0.00");
			Double valorTotal = broaPreco + paoPreco;
			Double reserva = valorTotal * 0.10;

			JOptionPane.showMessageDialog(null, "O valor total de p�es vendidos �: R$ " + arred.format(paoPreco)
					+ "\nO valor total de broas vendidos �: R$ " + arred.format(broaPreco)
					+ "\nO valor total de vendas � de: R$ " + arred.format(valorTotal)
					+ "\nVoc� deve guardar na reserva: R$ " + arred.format(reserva));

		} else {
			JOptionPane.showMessageDialog(null, "Informe um n�mero v�lido maior ou igual a zero!");
		}
	}
}
