package aula3;

public class NumerosPares {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 100 ; i++) {
			Integer numero = i;
			
			// O % resulta o resto da divis�o.
			if ((numero % 2) == 0){
				System.out.println("O n�mero " + numero + " � par!");
			}	
		}
	}
}
