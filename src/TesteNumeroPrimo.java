
public class TesteNumeroPrimo {

	public static void main(String[] args) {

		// Programa que verifica se um n�mero � primo
		int numero = 13;
		boolean primo = true;
		
		for (int contador = numero - 1 ; contador > 1 ; contador--) {
			
			if (numero % contador == 0) {
				
				primo = false;
				System.out.println("O n�mero n�o � primo.");
				break;
				
			}
						
		}
		
		if (primo) {
			
			System.out.println("O n�mero � primo.");
			
		}
		
	}

}
