package atividadesAula1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Ativida para realizar cálcula da área de um terreno retangular.
public class atv1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		JOptionPane.showMessageDialog(null, "Este processo irá calcular a área do terreno desejado.\nClick em ok para prosseguir!");
		
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
		JOptionPane.showMessageDialog(null, "O valor de área do terreno é " +  arred.format(area) + " m²");
		}else {
			JOptionPane.showMessageDialog(null, "Tente novamente!");
		}
	}
}
