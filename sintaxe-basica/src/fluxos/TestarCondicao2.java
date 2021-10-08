package fluxos;

public class TestarCondicao2 {
	
	public static void main(String[] args) { 
		

		System.out.println("---- TESTANDO CONDICIONAIS ----");
		
		int idade = 13,qntdpessoas=2;
		
		//Operador OU, basta uma ser verdadeira.
		if (idade >= 18 || qntdpessoas >= 2) {
			System.out.println("\nSEJA BEM VINDO, VOCÊ PODE ENTRAR ---1---.");
		}
		
		//Operador AND, as duas tem que ser verdadeira.
		if (idade >= 18 && qntdpessoas >= 2) {
			System.out.println("\nSEJA BEM VINDO, VOCÊ PODE ENTRAR ---2---.");
		}
		
		//SEMPRE VAI APARECER NA TELA, NESSE CASO
		else {
			System.out.println("VOCÊ REALMENTE NÃO PODE ENTRAR.");
		}
	}
}
