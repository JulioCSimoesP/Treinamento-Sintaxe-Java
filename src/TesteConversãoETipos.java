
public class TesteConversãoETipos {
	
	public static void main(String[] args) {
		
		//Teste de conversão de double para int
		double salario = 12345.678;
		int valor = (int) salario;
		System.out.println(valor);
		
		//Teste de atribuição de número long
		long numeroGrande = 123456789123456789l;
		System.out.println(numeroGrande);
		
		//Teste de atribuição de número short
		short numeroPequeno = 12345;
		System.out.println(numeroPequeno);
		
		//Teste de atribuição de número byte 
		byte numeroMuitoPequeno = 123;
		System.out.println(numeroMuitoPequeno);
		
		//Teste de precisão de número double
		double numero1 = 0.1;
		double numero2 = 0.2;
		double total = numero1 + numero2;
		System.out.println(total);
		
		//Teste de atribuição de número float
		float numeroFlutuante1 = 123.45f;
		float numeroFlutuante2 = (float) 543.21;
		System.out.println(numeroFlutuante1 + "\n" + numeroFlutuante2);
		
	}

}
