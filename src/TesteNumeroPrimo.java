
public class TesteNumeroPrimo {

	public static void main(String[] args) {

		// Programa que verifica se um número é primo
		int numero = 13;
		boolean primo = true;
		
		for (int contador = numero - 1 ; contador > 1 ; contador--) {
			
			if (numero % contador == 0) {
				
				primo = false;
				System.out.println("O número não é primo.");
				break;
				
			}
						
		}
		
		if (primo) {
			
			System.out.println("O número é primo.");
			
		}
		
	}

}
