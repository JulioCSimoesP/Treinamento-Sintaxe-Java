
public class TesteEscopo {

	public static void main(String[] args) {
		
		//Testa escopo de vari�veis
		if (true) {
			
			String frase = "Esta vari�vel pertence ao escopo do 'if'.";
			System.out.println(frase);
			
		}
		
		if (true) {
			
			String frase = "Esta vari�vel pertence ao escopo de outro 'if'.";
			System.out.println(frase);
			
		}
		
		String frase = "Esta vari�vel pertence ao escopo do 'main'.";
		System.out.println(frase);
		
		//Testa a utiliza��o de vari�vel declarada mas n�o inicializada
		boolean valor;
		int numero = 1;
		
		if (numero == 1) {
			
			valor = true;
			
		} else {
			
			valor = false;
			
		}
		
		System.out.println("O c�digo s� pode ser compilado se todas as possibilidades do �ltimo if"
				+ " derem a oportunidade da vari�vel 'valor' ser inicializada antes desse 'print'");
		
	}

}
