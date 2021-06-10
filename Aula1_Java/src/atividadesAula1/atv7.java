package atividadesAula1;

import javax.swing.JOptionPane;

//Atividade para calcular o número de dias desde o inicio do ano.
public class atv7 {

	public static Integer isValid(String param) throws InterruptedException {

		Integer valorInt = 0;
		try {
			valorInt = (Integer.parseInt(param));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe número válido!");
			throw new InterruptedException();
		}
		return valorInt;
	}

	public static void main(String[] args) throws InterruptedException {

		JOptionPane.showMessageDialog(null,
				"Este processo irá calcular o número de dias passados do início do ano até a data informada."
						+ ".\nClick em ok para prosseguir!");

		String dia = JOptionPane
				.showInputDialog("Por favor, informe o dia do mês. Considere que os mêses possuem 30 dias!");
		Integer diaInt = isValid(dia);

		if (0 < diaInt && diaInt < 31) {
			
			String mes = JOptionPane.showInputDialog("Por favor, informe o mês.");
			Integer mesInt = isValid(mes);
			
			if (0 < mesInt && mesInt < 13) {
				
				Integer diasPassado = 30*(mesInt-1) + diaInt;
				JOptionPane.showMessageDialog(null, "Desde o inicio do ano passaram um total de " + diasPassado + " dias");
			} else {
				JOptionPane.showMessageDialog(null, "O mes precisa ser um número entre 1 e 13.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "O dia precisa ser um número entre 1 e 30.");
		}
	}
}
