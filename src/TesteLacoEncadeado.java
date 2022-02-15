
public class TesteLacoEncadeado {

	public static void main(String[] args) {

		//Programa que exibe no console uma tabela com a tabuada dos números
		//dividida em linhas
		for (int numero = 1 ; numero < 10 ; numero++) {
			
			for (int multiplicador = 0 ; multiplicador < 10 ; multiplicador++) {
				
				System.out.print(numero + " x " + multiplicador + " = " + numero * multiplicador);
				if (multiplicador != 9) {
					
					System.out.print(" | ");
					
				} else {
					
					System.out.println();
					
				}
				
			}
			
		}
		
	}

}
