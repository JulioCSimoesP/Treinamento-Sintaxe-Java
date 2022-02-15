
public class TesteLacoFor {

	public static void main(String[] args) {
		
		//Testa o funcionamento do laço for com um programa que exibe
		//no console a soma dos elementos de uma sequência
		int valorTotal = 1;
		
		for (int i = 2 ; i <= 10 ; i++) {
			
			int valorAtual = valorTotal;
			
			valorTotal += i;
			System.out.println(valorAtual + " + " + i + " = " + valorTotal);
			
		}
				
	}

}
