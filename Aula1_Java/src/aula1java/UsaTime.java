package aula1java;

public class UsaTime {

	public static void main(String[] args) {

		Time palmeiras = new Time();
		palmeiras.setNome("Palmeiras");
		palmeiras.setEstado("SP");
		palmeiras.setLocalEstadio("Murumbi");
		palmeiras.setCampeonato("Brasileiro");
		palmeiras.setTitulos(5);
		palmeiras.setNumJogadores(26);
		
		Time saopaulo = new Time();
		saopaulo.setNome("São Paulo");
		saopaulo.setEstado("SP");
		saopaulo.setLocalEstadio("Estadio SP");
		saopaulo.setCampeonato("Brasileiro");
		saopaulo.setTitulos(7);
		saopaulo.setNumJogadores(31);
		
		System.out.println("HOJE A FINAL SERÁ: " + palmeiras.getNome() +" X "+ saopaulo.getNome());
	}
}
