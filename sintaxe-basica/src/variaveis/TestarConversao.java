package variaveis;

public class TestarConversao {

	public static void main(String[] args) {
		
		double x = 34.50;
		int y = (int)x;
		
		System.out.printf("A parte inteira de x é: %d\n", y);
		
		//Números que são muito grandes, usamos o long visto que ele suporta 64 bits e o int 32 bits
				
		long numeromuitogrande = 2000000000000000000L;
		System.out.println(numeromuitogrande);
		
		short numeropequeno = 8998;
		System.out.println(numeropequeno);
		
		byte numeromenorqueopequeno = 127;
		System.out.println(numeromenorqueopequeno);
		
	}
}