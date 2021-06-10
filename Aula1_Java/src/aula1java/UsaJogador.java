package aula1java;

public class UsaJogador {

	public static void main(String[] args) {

		Jogador atacante = new Jogador();
		
		//Pega valores com GET e seta valores com SET
		atacante.setNome("Ronaldo");
		atacante.setAltura(1.82);
		atacante.setPeso(80.0);
		atacante.setPosicao("Atacante");
		
		Jogador goleiro = new Jogador();
		
		goleiro.setNome("Tafareu");
		goleiro.setAltura(1.90);
		goleiro.setPeso(76.0);
		goleiro.setPosicao("Goleiro");		
		
		Jogador zagueiro = new Jogador();
		
		zagueiro.setNome("Zézé");
		zagueiro.setAltura(1.81);
		zagueiro.setPeso(84.0);
		zagueiro.setPosicao("Goleiro");
		
		Jogador meiocampo = new Jogador();
		
		meiocampo.setNome("Zico");
		meiocampo.setAltura(1.75);
		meiocampo.setPeso(74.0);
		meiocampo.setPosicao("Meio campo");
		
		System.out.println("O nome do Atacante é: " + atacante.getNome());
		System.out.println("A altura do Atacante é: " + atacante.getAltura());
		System.out.println("O peso do Atacante é: " + atacante.getPeso());
		System.out.println();
		System.out.println("O nome do Meio Campo é: " + meiocampo.getNome());
		System.out.println("A altura do Meio Campo é: " + meiocampo.getAltura());
		System.out.println("O peso do Meio Campo é: " + meiocampo.getPeso());
		System.out.println();
		System.out.println("Com toString : " + zagueiro);
		System.out.println("Com toString : " + goleiro);
		
	}
}
