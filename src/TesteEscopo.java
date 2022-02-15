
public class TesteEscopo {

	public static void main(String[] args) {
		
		//Testa escopo de variáveis
		if (true) {
			
			String frase = "Esta variável pertence ao escopo do 'if'.";
			System.out.println(frase);
			
		}
		
		if (true) {
			
			String frase = "Esta variável pertence ao escopo de outro 'if'.";
			System.out.println(frase);
			
		}
		
		String frase = "Esta variável pertence ao escopo do 'main'.";
		System.out.println(frase);
		
		//Testa a utilização de variável declarada mas não inicializada
		boolean valor;
		int numero = 1;
		
		if (numero == 1) {
			
			valor = true;
			
		} else {
			
			valor = false;
			
		}
		
		System.out.println("O código só pode ser compilado se todas as possibilidades do último if"
				+ " derem a oportunidade da variável 'valor' ser inicializada antes desse 'print'");
		
	}

}
