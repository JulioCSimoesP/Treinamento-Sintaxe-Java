
public class TesteString {

	public static void main(String[] args) {

		//Teste de impressão de string
		System.out.println("Olá Mundo\nTestando strings");
		
		//Testa atribuição de char
		char letra1 = 'a';
		System.out.println(letra1);
		
		char letra2 = 65;
		System.out.println(letra2);
		
		letra2 = (char) (letra1 + 5);
		System.out.println(letra2);
		
		//Testa atribuição e concatenação de String
		String frase1 = "Olá Mundo!";
		System.out.println(frase1);
		
		String frase2 = " O ano é ";
		System.out.println(frase1 + frase2 + 2022 + ".");
		
	}

}
