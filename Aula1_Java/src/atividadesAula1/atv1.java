package atividadesAula1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Ativida para realizar c�lcula da �rea de um terreno retangular.
public class atv1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		JOptionPane.showMessageDialog(null, "Este processo ir� calcular a �rea do terreno desejado.\nClick em ok para prosseguir!");
		
		Double c = 0.00;
		Double l = 0.00;
		
		String larg = JOptionPane.showInputDialog("Informe o perimitro do comprimento em metros:");
		try {
			l = Double.parseDouble(larg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero valido!\nUse \".\" para separar casas decimais.");
			throw new InterruptedException();
			
		}
		
		String comp = JOptionPane.showInputDialog("Informe o perimitro do comprimento em metros:");
		try {
			c = Double.parseDouble(comp);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe um numero valido!\nUse \".\" para separar casas decimais.");
			throw new InterruptedException();
		}
			
		if( l != 0 && c != 0 ) {
		Double area = c*l;
		DecimalFormat arred = new DecimalFormat("#0.00");
		JOptionPane.showMessageDialog(null, "O valor de �rea do terreno � " +  arred.format(area) + " m�");
		}else {
			JOptionPane.showMessageDialog(null, "Tente novamente!");
		}
	}
}
