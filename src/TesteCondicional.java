
public class TesteCondicional {

	public static void main(String[] args) {

		// Testa uso do condicional if e else
		int idade = 16;
		int quantidadePessoas = 5;

		if (idade >= 18) {

			System.out.println("Seja Bem-Vindo!");

		} else {

			System.out.print("Você não é maior de idade");

			if (quantidadePessoas >= 2) {

				System.out.println(", mas você pode entrar.");

			} else {

				System.out.println(" e nem está acompanhado"
				+ ", você não pode entrar.");

			}

		}

	}

}
