package variaveis;

public class TestarValores {
	
	public static void main(String[] args) {
		
		//PASSAGEM POR VALOR
		
		int valor1 = 10;
		int valor2 = 30;
		
		System.out.println("---- ANTES DAS PASSAGENS ----\n");
		System.out.printf("Valor1 = %d\n", valor1);
		System.out.printf("Valor2 = %d\n", valor2);
		
		valor2 = valor1;
		
		System.out.println("\n---- DEPOIS DA PRIMEIRA PASSAGEM ----\n");
		System.out.printf("Valor1 = %d\n", valor1);
		System.out.printf("Valor2 = %d\n", valor2);
		
		valor1 = 90;
		
		System.out.println("\n---- DEPOIS DA SEGUNDA PASSAGEM ----\n");
		
		System.out.printf("Valor1 = %d\n", valor1);
		System.out.printf("Valor2 = %d\n", valor2);
		
		
	}

}
