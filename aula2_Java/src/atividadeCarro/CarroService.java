package atividadeCarro;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

// Atividade Carro.java - Usa classes Carro, Pneu, Motor, Banco
public class CarroService {

	public static Double isValidDouble(String param) throws InterruptedException {

		Double valorDoub = 0.0;
		try {
			valorDoub = (Double.parseDouble(param));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe número válido! Use \".\" para separar casas decimais.");
			throw new InterruptedException();
		}
		Double valorPositivo = valorDoub < 0 ? valorDoub*-1 : valorDoub;
		return valorPositivo;
	}
	
	public static Integer isValidInteger(String param) throws InterruptedException {

		Integer valorInt = 0;
		try {
			valorInt = (Integer.parseInt(param));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe número válido!");
			throw new InterruptedException();
		}
		Integer valorPositivo = valorInt < 0 ? valorInt*-1 : valorInt;
		return valorPositivo;
	}

// Método principal	
	public static void main(String[] args) throws InterruptedException {

		DecimalFormat arred = new DecimalFormat("#0.00");
		
		JOptionPane.showMessageDialog(null,
				"Este processo irá calcular o preço de custo de carro"
						+ ".\nClick em ok para prosseguir!");
		
		
		Carro carro1 = new Carro();
		
		String modelo = JOptionPane.showInputDialog("Informe o Modelo-Nome do carro:");
		
		if(modelo.isEmpty()) {
			JOptionPane.showMessageDialog(null,"O Modelo-Nome do carro é obrigatório."
					+ "\nTente novamente!");
			throw new InterruptedException();
		} else {
			carro1.setMarca(modelo);

			// Informações Pneu
			
			JOptionPane.showMessageDialog(null, "Insira informações do PNEU.");

			String preco = JOptionPane.showInputDialog("Preço do PNEU:");
			Double precoPneu = isValidDouble(preco);
			String tipoPneu = JOptionPane.showInputDialog("Tipo do PNEU:");
			String fabricantePneu = JOptionPane.showInputDialog("Fabricante PNEU:");

			carro1.setPneu(new Pneu(precoPneu, tipoPneu, fabricantePneu));
			

			// Informações Motor
			JOptionPane.showMessageDialog(null, "Insira informações do MOTOR.");

			preco = JOptionPane.showInputDialog("Preço do MOTOR:");
			Double precoMotor = isValidDouble(preco);
			String potencia = JOptionPane.showInputDialog("Potencia(CV) do MOTOR:");
			Integer potenciaMotor = isValidInteger(potencia);
			String fabricanteMotor = JOptionPane.showInputDialog("Fabricante MOTOR:");
			
			carro1.setMotor(new Motor(precoMotor, potenciaMotor, fabricanteMotor));

			
			// Informações Banco
			preco = JOptionPane.showInputDialog("Preço do BANCO:");
			Double precoBanco = isValidDouble(preco);
			String modeloBanco = JOptionPane.showInputDialog("Modelo do BANCO:");
			String fabricanteBanco = JOptionPane.showInputDialog("Fabricante BANCO:");
			
			carro1.setBanco(new Banco(precoBanco, modeloBanco, fabricanteBanco));
			
			
			//Cálculo do preço de custo do carro.
			Double precoTotal = precoBanco + precoMotor + precoPneu;
			
			JOptionPane.showMessageDialog(null,
					"Informações cadastradas com sucesso!"
							+ "\n\nCARRO: " + carro1.getMarca()
							
							+ "\n\nPNEU"
							+ "\nPreço: R$ " + arred.format(carro1.getPneu().getPreco())
							+ "\nTipo: " + carro1.getPneu().getTipo()
							+ "\nFabricante: " + carro1.getPneu().getFabricante()
							
							+ "\n\nMOTOR"
							+ "\nPreço: R$ " + arred.format(carro1.getMotor().getPreco())
							+ "\nPodetência: " + carro1.getMotor().getPotencia() + "cavalo(s)"
							+ "\nFabricante: " + carro1.getMotor().getFabricante()
							
							+ "\n\nBANCO"
							+ "\nPreço: R$ " + arred.format(carro1.getBanco().getPreco())
							+ "\nModelo: " + carro1.getBanco().getModelo()
							+ "\nFabricante: " + carro1.getBanco().getFabricante()
							
							+ "\n\nPreço Custo (Banco + Pneu + Motor):"
							+ "\nR$ " + arred.format(precoTotal) + "\n");	
		}
	}
}
