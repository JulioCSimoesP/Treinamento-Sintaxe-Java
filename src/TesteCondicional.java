
public class TesteCondicional {

	public static void main(String[] args) {

		// Testa uso do condicional if e else
		int idade = 16;
		int quantidadePessoas = 5;

		if (idade >= 18) {

			System.out.println("Seja Bem-Vindo!");

		} else {

			System.out.print("Voc� n�o � maior de idade");

			if (quantidadePessoas >= 2) {

				System.out.println(", mas voc� pode entrar.");

			} else {

				System.out.println(" e nem est� acompanhado"
				+ ", voc� n�o pode entrar.");

			}

		}

	}

}
