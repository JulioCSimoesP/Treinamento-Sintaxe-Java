
public class TesteContador {

	public static void main(String[] args) {

		//Programa que exibe no console a soma dos elementos de uma sequência
		//e testa o uso de variável em escopo diferente
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
