
public class TesteFatorial {

	public static void main(String[] args) {

		// Programa que verifica o fatorial de um número
		int fatorial = 8;
		int total = 1;
		for (int n = 1 ; n <= fatorial ; n++) {
			
			total *= n;
			
		}
		
		System.out.println("O fatorial de " + fatorial + " é igual a " + total + ".");
		
	}

}
