
public class TesteCondicional2 {

	public static void main(String[] args) {
		
		//Define e exibe salário
		
		double salario =  4000;
		System.out.println("Seu salário bruto é de R$" + salario + ".");
		
		//Verifica a alíquota do imposto de renda, aplica a dedução do imposto
		//e exibe o salário após a dedução
		
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
		System.out.println("Sua alíquota é de até " + impostoDeRenda * 100 + "%.\n"
				+ "Foram deduzidos R$" + valorDeduzido + " do seu salário bruto.\n"
				+ "Seu salário líquido é de R$" + salarioLiquido + ".");
			
	}

}
