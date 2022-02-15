
public class TesteMultiplo {

	public static void main(String[] args) {

		// Programa que verifica os múltiplos de um número x
		// entre o intervalo de 1 e um número y
		int multiplo = 3;
		int limite = 100;
		
		System.out.print("Os múltiplos de " + multiplo + " entre 1 e " + limite + " são : ");
		for (int contador = 1 ; contador <= (limite / multiplo) ; contador++) {
			
			System.out.print(multiplo * contador);
			if (contador < (limite / multiplo)) {
				
				System.out.print(", ");
				
			} else {
				
				System.out.println(".");
				
			}
			
		}

	}

}
