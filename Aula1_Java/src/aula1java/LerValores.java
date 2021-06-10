package aula1java;

import javax.swing.JOptionPane;

public class LerValores {

	public static void main(String[] args) {
		Integer valor1;
		Double decimal;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para número: "));
		// Abre uma caixa de diálogo com o usuário
		// Converte para inteiro com parseInt pois a digitação será em string
		
		System.out.println("O valor digitado foi = " + valor1);
		
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Informe um número decimal"));
		System.out.println("Decimal é = " + decimal );
		
		JOptionPane.showMessageDialog(null, "O valor decimal é: " + decimal); //Cria uma caixa de avisa similar ao spam
		
	}
}
