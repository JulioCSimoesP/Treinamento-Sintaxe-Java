
public class TesteCondicionalBoolean {

	public static void main(String[] args) {

		// Testa uso do condicional if e else com operadores booleanos
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;
		
		
		//Verifica se est� acompanhado
		if (acompanhado) {
			
			System.out.println("Voc� est� acompanhado.");
			
		} else {
			
			System.out.println("Voc� n�o est� acompanhado.");
			
		}
		
		//Verifica se atende algum requisito de entrada
		if (idade >= 18 || quantidadePessoas >= 3) {

			System.out.println("Seja Bem-Vindo!");

		} else {

			System.out.println("Voc� n�o pode entrar.");

		}
		
		//Verifica se nenhum requisito � atendido
		if (idade < 18 && !acompanhado) {
			
			System.out.println("Voc� n�o atende nenhum requisito.");
			
		}

	}

}
