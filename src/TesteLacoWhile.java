
public class TesteLacoWhile {

	public static void main(String[] args) {
		
		//Testa o funcionamento do la�o while
		int contador = 1;
		
		while (contador <= 10) {
			
			System.out.print(contador);
			if (contador < 10) {	
				
				System.out.print(", ");		
				
			} else {	
				
				System.out.println(".");	
				
			}
			contador = contador + 1;
			
		}
		
		//Testa operadores de atribui��o
		System.out.println("O contador atual � " + contador);
		contador += 1;
		System.out.println("Contador + 1 = " + contador);
		contador -= 1;
		System.out.println("Contador - 1 = " + contador);
		contador *= 3;
		System.out.println("Contador * 3 = " + contador);
		contador /= 3;
		System.out.println("Contador / 3 = " + contador);
		contador %= 3;
		System.out.println("Resto de contador / 3 = " + contador);
		
		contador = 1;
		System.out.println("O contador atual � " + contador);
		contador++;
		System.out.println("Contador incrementado = " + contador);
		contador--;
		System.out.println("Contador decrementado = " + contador);
		
	}

}
