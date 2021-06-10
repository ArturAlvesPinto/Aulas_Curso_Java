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
			JOptionPane.showMessageDialog(null, "Informe n�mero v�lido! Use \".\" para separar casas decimais.");
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
			JOptionPane.showMessageDialog(null, "Informe n�mero v�lido!");
			throw new InterruptedException();
		}
		Integer valorPositivo = valorInt < 0 ? valorInt*-1 : valorInt;
		return valorPositivo;
	}

// M�todo principal	
	public static void main(String[] args) throws InterruptedException {

		DecimalFormat arred = new DecimalFormat("#0.00");
		
		JOptionPane.showMessageDialog(null,
				"Este processo ir� calcular o pre�o de custo de carro"
						+ ".\nClick em ok para prosseguir!");
		
		
		Carro carro1 = new Carro();
		
		String modelo = JOptionPane.showInputDialog("Informe o Modelo-Nome do carro:");
		
		if(modelo.isEmpty()) {
			JOptionPane.showMessageDialog(null,"O Modelo-Nome do carro � obrigat�rio."
					+ "\nTente novamente!");
			throw new InterruptedException();
		} else {
			carro1.setMarca(modelo);

			// Informa��es Pneu
			
			JOptionPane.showMessageDialog(null, "Insira informa��es do PNEU.");

			String preco = JOptionPane.showInputDialog("Pre�o do PNEU:");
			Double precoPneu = isValidDouble(preco);
			String tipoPneu = JOptionPane.showInputDialog("Tipo do PNEU:");
			String fabricantePneu = JOptionPane.showInputDialog("Fabricante PNEU:");

			carro1.setPneu(new Pneu(precoPneu, tipoPneu, fabricantePneu));
			

			// Informa��es Motor
			JOptionPane.showMessageDialog(null, "Insira informa��es do MOTOR.");

			preco = JOptionPane.showInputDialog("Pre�o do MOTOR:");
			Double precoMotor = isValidDouble(preco);
			String potencia = JOptionPane.showInputDialog("Potencia(CV) do MOTOR:");
			Integer potenciaMotor = isValidInteger(potencia);
			String fabricanteMotor = JOptionPane.showInputDialog("Fabricante MOTOR:");
			
			carro1.setMotor(new Motor(precoMotor, potenciaMotor, fabricanteMotor));

			
			// Informa��es Banco
			preco = JOptionPane.showInputDialog("Pre�o do BANCO:");
			Double precoBanco = isValidDouble(preco);
			String modeloBanco = JOptionPane.showInputDialog("Modelo do BANCO:");
			String fabricanteBanco = JOptionPane.showInputDialog("Fabricante BANCO:");
			
			carro1.setBanco(new Banco(precoBanco, modeloBanco, fabricanteBanco));
			
			
			//C�lculo do pre�o de custo do carro.
			Double precoTotal = precoBanco + precoMotor + precoPneu;
			
			JOptionPane.showMessageDialog(null,
					"Informa��es cadastradas com sucesso!"
							+ "\n\nCARRO: " + carro1.getMarca()
							
							+ "\n\nPNEU"
							+ "\nPre�o: R$ " + arred.format(carro1.getPneu().getPreco())
							+ "\nTipo: " + carro1.getPneu().getTipo()
							+ "\nFabricante: " + carro1.getPneu().getFabricante()
							
							+ "\n\nMOTOR"
							+ "\nPre�o: R$ " + arred.format(carro1.getMotor().getPreco())
							+ "\nPodet�ncia: " + carro1.getMotor().getPotencia() + "cavalo(s)"
							+ "\nFabricante: " + carro1.getMotor().getFabricante()
							
							+ "\n\nBANCO"
							+ "\nPre�o: R$ " + arred.format(carro1.getBanco().getPreco())
							+ "\nModelo: " + carro1.getBanco().getModelo()
							+ "\nFabricante: " + carro1.getBanco().getFabricante()
							
							+ "\n\nPre�o Custo (Banco + Pneu + Motor):"
							+ "\nR$ " + arred.format(precoTotal) + "\n");	
		}
	}
}
