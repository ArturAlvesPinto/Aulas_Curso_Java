package aula1java;

import javax.swing.JOptionPane;

public class LerValores {

	public static void main(String[] args) {
		Integer valor1;
		Double decimal;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para n�mero: "));
		// Abre uma caixa de di�logo com o usu�rio
		// Converte para inteiro com parseInt pois a digita��o ser� em string
		
		System.out.println("O valor digitado foi = " + valor1);
		
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero decimal"));
		System.out.println("Decimal � = " + decimal );
		
		JOptionPane.showMessageDialog(null, "O valor decimal �: " + decimal); //Cria uma caixa de avisa similar ao spam
		
	}
}
