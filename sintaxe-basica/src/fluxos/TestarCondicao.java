package fluxos;

public class TestarCondicao {
	
	public static void main(String[] args) { 
		
		//Basta digitar sysout e dar "ctrl+espa�o" que se completa.
		System.out.println("---- TESTANDO CONDICIONAIS ----");
		
		int idade = 20,qntdpessoas=2;
		
		//Caso seu bloco de if tenha apenas uma instru��o, como o exemplo:
		
		if (idade >= 18) {
			
			System.out.println("\nVOC� � MAIOR DE IDADE, PODE ENTRAR.");
		}
		
		//Voc� n�o precisa de chaves, ou seja, voc� poderia escrever assim:
		
		if(idade >= 18)
			
			System.out.println("\nVOC� � MAIOR DE IDADE, PODE ENTRAR.\nps: teste de chaves :)");
		
		//Caso o bloco tenha mais de uma instru��o, � necessario colocas as chaves.
		
		//vale o mesmo para o else, para adicionar ou n�o as chaves
		else {
			
			System.out.println("\nVOC� N�O � MAIOR DE IDADE.\nVamos analisar a quantidade de pessoas.\n");
			
			if(qntdpessoas > 2) {
				
				System.out.println("PODE ENTRAR, VOC� EST� ACOMPANHADO.");	
			}
			
			else {
				System.out.println("VOC� REALMENTE N�O PODE ENTRAR.");
			}
			
		}
	}
}