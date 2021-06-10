package aula3;

import javax.swing.JOptionPane;

public class CalcularSalarioService {

	public static void main(String[] args) {

		CalcularSalario objSalario = new CalcularSalario();

		Double sal = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do sal�rio: "));
		Double taxa = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do taxa: "));

		objSalario.setSalario(sal);
		objSalario.setTaxa(taxa);
		
		//Mostra o sal�rio calculado a partir da taxa
		objSalario.salarioCalculado();
		
		//Retorna o valor do salario calculado a partir da taxa
		Double valor = objSalario.salarioCalculadoComRetorno();
		System.out.println("Sal�rio calculado: R$ " + valor);
		
	}
}
