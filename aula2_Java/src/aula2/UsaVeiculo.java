package aula2;

public class UsaVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo01 = new Veiculo();
		
		veiculo01.setModelo("Fusca");
		veiculo01.setMotorista("Sem Motorista");
		veiculo01.setCor("Azul");
		veiculo01.setPlaca("HTP-8080");
		veiculo01.setAno(2015);
		veiculo01.qtdPortas = 4; //seta-se assim pois n�o � um m�todo.
		System.out.println(veiculo01);

		//Vem com os valores padr�o que est� no contrutor pois n�o tem set's
		Veiculo veiculo02 = new Veiculo();
		System.out.println(veiculo02);
		
		//Neste caso est� sendo usado o construtor com passagen de parametros.
		Veiculo veiculo03 = new Veiculo("Palio", "ASFD-9874", "Prata", "N�o Teve", 2020, "Autom�tico", 4);
		System.out.println(veiculo03);
		
	}

}
