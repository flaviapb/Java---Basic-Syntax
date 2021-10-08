package fluxos;

public class TestarEscopo {
	
	public static void main(String[] args) {
	
		//boolean aconpanhado = false;
		int qntdpessoa = 2, idade2 = 20;
		
		if(qntdpessoa >= 2 || idade2 < 18 ) {
			
			//CASO A GENTE FAÇA ESSA DECLARAÇÃO DE VARIÁVEL SÓ EM UM BLOCO DE CÓDIGO, NÃO CONSEGUIREMOS UTILIZA-LÁ NAQUELE BLOCO.
			
			boolean aconpanhado = true; //a variável aconpanhado ainda não existe
			
			System.out.printf("\nEstá acompanhado? %b",aconpanhado); //a variável aconpanhado existe
		} // a variável aconpanhado não existe mais
		
		
		else {
			boolean aconpanhado = false; //a variável aconpanhado ainda não existe
			
			System.out.printf("\nEstá acompanhado? %b",aconpanhado); //a variável aconpanhado existe
		}
		
		// Essa foi uma forma não tá tão boa de declarar variáveis, vamos fazer outro exemplo de uma forma mais agradavel.
		
		boolean feliz = true;
		
		if(feliz) {
			System.out.println("\nEstá Feliz.");
		}
		
		else {
			System.out.println("\nEstá Triste");
		}
		
		//Declarando a variável uma vez só, antes de começar algum bloco é a melhor forma, pois você consegue aproveitar melhor o uso da variável.
	} 
}