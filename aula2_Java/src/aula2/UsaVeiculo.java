package aula2;

public class UsaVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo01 = new Veiculo();
		
		veiculo01.setModelo("Fusca");
		veiculo01.setMotorista("Sem Motorista");
		veiculo01.setCor("Azul");
		veiculo01.setPlaca("HTP-8080");
		veiculo01.setAno(2015);
		veiculo01.qtdPortas = 4; //seta-se assim pois não é um método.
		System.out.println(veiculo01);

		//Vem com os valores padrão que está no contrutor pois não tem set's
		Veiculo veiculo02 = new Veiculo();
		System.out.println(veiculo02);
		
		//Neste caso está sendo usado o construtor com passagen de parametros.
		Veiculo veiculo03 = new Veiculo("Palio", "ASFD-9874", "Prata", "Não Teve", 2020, "Automático", 4);
		System.out.println(veiculo03);
		
	}

}
