package atividadesAula1;

import javax.swing.JOptionPane;

//Atividade para calcular quantas n� de ferraduras de acordo com n�mero de cavalos.
public class atv2 {

	public static void main(String[] args) throws InterruptedException {
		
		JOptionPane.showMessageDialog(null, "Este processo ir� calcular o n�mero de ferraduras de acordo com o n�mero de cavalos informado"
				+ ".\nClick em ok para prosseguir!");
		
		Integer numero = 0;
		Integer numPatas = 4;
		String cavalos = JOptionPane.showInputDialog("Informe o n�mero de cavalos:");
		try {
			numero = Integer.parseInt(cavalos);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero valido!");
			throw new InterruptedException();
			
		}
		
		if( numero >= 0 ) {
		Integer ferradura = numero*numPatas;
		JOptionPane.showMessageDialog(null, "O total de ferraduras necessario � de " +  ferradura + " ferraduras!");
		}else {
			JOptionPane.showMessageDialog(null, "Informe um n�mero v�lido maior ou igual a zero!");
		}
	}

}

