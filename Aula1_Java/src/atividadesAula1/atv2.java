package atividadesAula1;

import javax.swing.JOptionPane;

//Atividade para calcular quantas nº de ferraduras de acordo com número de cavalos.
public class atv2 {

	public static void main(String[] args) throws InterruptedException {
		
		JOptionPane.showMessageDialog(null, "Este processo irá calcular o número de ferraduras de acordo com o número de cavalos informado"
				+ ".\nClick em ok para prosseguir!");
		
		Integer numero = 0;
		Integer numPatas = 4;
		String cavalos = JOptionPane.showInputDialog("Informe o número de cavalos:");
		try {
			numero = Integer.parseInt(cavalos);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero valido!");
			throw new InterruptedException();
			
		}
		
		if( numero >= 0 ) {
		Integer ferradura = numero*numPatas;
		JOptionPane.showMessageDialog(null, "O total de ferraduras necessario é de " +  ferradura + " ferraduras!");
		}else {
			JOptionPane.showMessageDialog(null, "Informe um número válido maior ou igual a zero!");
		}
	}

}

