package br.com.usaClasseAviaoJAR;

import br.com.jcavitreinamentos.aviao.Aviao;


// Utilizando class JAR importada
// Build path > Configure build path > Libaries > Add External JARs 
public class UsaAviao {

	public static void main(String[] args) {
		Aviao av = new Aviao();
		
		av.setPiloto("Marcio");
		av.setModeloAviao("C-20311");

		System.out.println(av.getPiloto());
		System.out.println(av.getModeloAviao());
		
	}
	
}
