
public class TesteLacoEncadeado2 {

	public static void main(String[] args) {

		// Programa que exibe um "quadrado" de 10x10 asteriscos
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {

				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println("\n\n");

		// Programa que exibe um "quadrado" de 10x10 asteriscos
		// sem os asteriscos primos
		int numero = 1;
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {

				boolean primo = true;

				for (int divisor = numero - 1; divisor > 1; divisor--) {

					if (numero % divisor == 0) {

						primo = false;

					}

				}

				if (primo) {

					System.out.print(" ");

				} else {

					System.out.print("*");

				}

				numero++;

			}

			System.out.println();

		}
		
		System.out.println("\n\n");

		// Programa que exibe um "triângulo" de asteriscos
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna <= linha; coluna++) {

				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println("\n\n");

		// Programa que exibe o inverso do último "triângulo"
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {

				if (coluna < linha) {

					System.out.print(" ");

				} else {

					System.out.print("*");

				}

			}

			System.out.println();

		}

	}

}
