package aula3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

// O for � usado para la�os de repeti��o
public class UsaFor {

	
	public static void main(String[] args) {
		
		//for (cond inicial; cond parada; iteracao)
		for (int i=1; i<=20; i++  ) {		
			System.out.println("Contagem: " + i); // Contagem de 1 a 20 como exemplo.
		}
		
		// calcula �rea de at� 3 terrenos
		String texto = "";
		for (int i=1; i<=3; i++  ) {		
			String comprimento = JOptionPane.showInputDialog("Informe o comprimeto do terreno " + i + " em metros:");
			String largura = JOptionPane.showInputDialog("Informe a largura do terreno " + i + " em metros:");
			
			DecimalFormat arred = new DecimalFormat("#0.000"); 
			Double area = Double.parseDouble(comprimento) * Double.parseDouble(largura);
			
			
			String msgm = "\nA �rea do terreno " + i + " � de " + arred.format(area) + " m�";
			texto = texto + msgm;
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}
