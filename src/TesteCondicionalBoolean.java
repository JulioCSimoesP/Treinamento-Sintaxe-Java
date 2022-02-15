
public class TesteCondicionalBoolean {

	public static void main(String[] args) {

		// Testa uso do condicional if e else com operadores booleanos
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;
		
		
		//Verifica se está acompanhado
		if (acompanhado) {
			
			System.out.println("Você está acompanhado.");
			
		} else {
			
			System.out.println("Você não está acompanhado.");
			
		}
		
		//Verifica se atende algum requisito de entrada
		if (idade >= 18 || quantidadePessoas >= 3) {

			System.out.println("Seja Bem-Vindo!");

		} else {

			System.out.println("Você não pode entrar.");

		}
		
		//Verifica se nenhum requisito é atendido
		if (idade < 18 && !acompanhado) {
			
			System.out.println("Você não atende nenhum requisito.");
			
		}

	}

}
