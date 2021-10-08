package fluxos;

public class TestarCondicaoBoolean {
	
	public static void main(String[] args) {
		
		//EXEMPLO COM OPERADOR AND 
		
		boolean aconpanhado = false;
		int idade = 20;
		
		if(idade >= 18 && aconpanhado) {
			System.out.println("LIVRE PARA ENTRAR :)");
		}
		
		else {
			System.out.println("BLOQUEADA SUA ENTRADA :(");
		}
		
		//EXEMPLO COM OPERADOR OR
		
		boolean aconpanhado2 = false;
		int qntdpessoa = 2, idade2 = 20;
		
		if(qntdpessoa >= 2 || idade2 < 18 ) {
			
			aconpanhado2 = true;
			System.out.println(aconpanhado2);
		}
		
		else {
			System.out.println(aconpanhado2);
		}	
	}
}