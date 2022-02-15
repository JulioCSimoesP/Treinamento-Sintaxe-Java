
public class TesteMultiplo {

	public static void main(String[] args) {

		// Programa que verifica os m�ltiplos de um n�mero x
		// entre o intervalo de 1 e um n�mero y
		int multiplo = 3;
		int limite = 100;
		
		System.out.print("Os m�ltiplos de " + multiplo + " entre 1 e " + limite + " s�o : ");
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
