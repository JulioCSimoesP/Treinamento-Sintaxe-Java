
public class TesteString {

	public static void main(String[] args) {

		//Teste de impress�o de string
		System.out.println("Ol� Mundo\nTestando strings");
		
		//Testa atribui��o de char
		char letra1 = 'a';
		System.out.println(letra1);
		
		char letra2 = 65;
		System.out.println(letra2);
		
		letra2 = (char) (letra1 + 5);
		System.out.println(letra2);
		
		//Testa atribui��o e concatena��o de String
		String frase1 = "Ol� Mundo!";
		System.out.println(frase1);
		
		String frase2 = " O ano � ";
		System.out.println(frase1 + frase2 + 2022 + ".");
		
	}

}
