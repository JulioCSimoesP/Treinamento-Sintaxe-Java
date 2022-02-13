
public class TesteConvers�oETipos {
	
	public static void main(String[] args) {
		
		//Teste de convers�o de double para int
		double salario = 12345.678;
		int valor = (int) salario;
		System.out.println(valor);
		
		//Teste de atribui��o de n�mero long
		long numeroGrande = 123456789123456789l;
		System.out.println(numeroGrande);
		
		//Teste de atribui��o de n�mero short
		short numeroPequeno = 12345;
		System.out.println(numeroPequeno);
		
		//Teste de atribui��o de n�mero byte 
		byte numeroMuitoPequeno = 123;
		System.out.println(numeroMuitoPequeno);
		
		//Teste de precis�o de n�mero double
		double numero1 = 0.1;
		double numero2 = 0.2;
		double total = numero1 + numero2;
		System.out.println(total);
		
		//Teste de atribui��o de n�mero float
		float numeroFlutuante1 = 123.45f;
		float numeroFlutuante2 = (float) 543.21;
		System.out.println(numeroFlutuante1 + "\n" + numeroFlutuante2);
		
	}

}
