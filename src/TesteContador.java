
public class TesteContador {

	public static void main(String[] args) {

		//Programa que exibe no console a soma dos elementos de uma sequ�ncia
		//e testa o uso de vari�vel em escopo diferente
		int contador = 1;
		int somaTotal = contador;
		
		while (contador < 100) {
			
			int somaAtual = somaTotal;
			contador++;
			somaTotal += contador;
			System.out.println(somaAtual + " + " + contador + " = " + somaTotal);
			
		}
		
	}

}
