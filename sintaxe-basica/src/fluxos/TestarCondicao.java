package fluxos;

public class TestarCondicao {
	
	public static void main(String[] args) { 
		
		//Basta digitar sysout e dar "ctrl+espaço" que se completa.
		System.out.println("---- TESTANDO CONDICIONAIS ----");
		
		int idade = 20,qntdpessoas=2;
		
		//Caso seu bloco de if tenha apenas uma instrução, como o exemplo:
		
		if (idade >= 18) {
			
			System.out.println("\nVOCÊ É MAIOR DE IDADE, PODE ENTRAR.");
		}
		
		//Você não precisa de chaves, ou seja, você poderia escrever assim:
		
		if(idade >= 18)
			
			System.out.println("\nVOCÊ É MAIOR DE IDADE, PODE ENTRAR.\nps: teste de chaves :)");
		
		//Caso o bloco tenha mais de uma instrução, é necessario colocas as chaves.
		
		//vale o mesmo para o else, para adicionar ou não as chaves
		else {
			
			System.out.println("\nVOCÊ NÃO É MAIOR DE IDADE.\nVamos analisar a quantidade de pessoas.\n");
			
			if(qntdpessoas > 2) {
				
				System.out.println("PODE ENTRAR, VOCÊ ESTÁ ACOMPANHADO.");	
			}
			
			else {
				System.out.println("VOCÊ REALMENTE NÃO PODE ENTRAR.");
			}
			
		}
	}
}