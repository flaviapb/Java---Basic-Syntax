package fluxos;

public class TestarEscopo {
	
	public static void main(String[] args) {
	
		//boolean aconpanhado = false;
		int qntdpessoa = 2, idade2 = 20;
		
		if(qntdpessoa >= 2 || idade2 < 18 ) {
			
			//CASO A GENTE FA�A ESSA DECLARA��O DE VARI�VEL S� EM UM BLOCO DE C�DIGO, N�O CONSEGUIREMOS UTILIZA-L� NAQUELE BLOCO.
			
			boolean aconpanhado = true; //a vari�vel aconpanhado ainda n�o existe
			
			System.out.printf("\nEst� acompanhado? %b",aconpanhado); //a vari�vel aconpanhado existe
		} // a vari�vel aconpanhado n�o existe mais
		
		
		else {
			boolean aconpanhado = false; //a vari�vel aconpanhado ainda n�o existe
			
			System.out.printf("\nEst� acompanhado? %b",aconpanhado); //a vari�vel aconpanhado existe
		}
		
		// Essa foi uma forma n�o t� t�o boa de declarar vari�veis, vamos fazer outro exemplo de uma forma mais agradavel.
		
		boolean feliz = true;
		
		if(feliz) {
			System.out.println("\nEst� Feliz.");
		}
		
		else {
			System.out.println("\nEst� Triste");
		}
		
		//Declarando a vari�vel uma vez s�, antes de come�ar algum bloco � a melhor forma, pois voc� consegue aproveitar melhor o uso da vari�vel.
	} 
}