
public class TesteCondicional2 {

	public static void main(String[] args) {
		
		//Define e exibe sal�rio
		
		double salario =  4000;
		System.out.println("Seu sal�rio bruto � de R$" + salario + ".");
		
		//Verifica a al�quota do imposto de renda, aplica a dedu��o do imposto
		//e exibe o sal�rio ap�s a dedu��o
		
		double impostoDeRenda;
		double impostoMaximo;
		double salarioLiquido;
		double valorDeduzido;
		if (salario >= 1900 && salario <= 2800) {
			
			impostoDeRenda = 0.075;
			impostoMaximo = 180;
			
		} else if (salario > 2800 && salario <= 3751) {
				
			impostoDeRenda = 0.15;
			impostoMaximo = 500;
			
		} else if (salario > 3751 && salario <= 4664) {
			
			impostoDeRenda = 0.225;
			impostoMaximo = 800;
			
		} else {
			
			impostoDeRenda = 0;
			impostoMaximo = 0;
			
		}
		
		if (impostoDeRenda * salario > impostoMaximo) {
			
			valorDeduzido = impostoMaximo;
			
		} else {
			
			valorDeduzido = impostoDeRenda * salario;
			
		}
		salarioLiquido = salario - valorDeduzido;
		System.out.println("Sua al�quota � de at� " + impostoDeRenda * 100 + "%.\n"
				+ "Foram deduzidos R$" + valorDeduzido + " do seu sal�rio bruto.\n"
				+ "Seu sal�rio l�quido � de R$" + salarioLiquido + ".");
			
	}

}
