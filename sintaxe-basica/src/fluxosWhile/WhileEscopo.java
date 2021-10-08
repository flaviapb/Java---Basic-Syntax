package fluxosWhile;

public class WhileEscopo {

	public static void main(String[] args) {

		int contador = 0, total = 0;
		
		while(contador <= 10) {
			
			//int total = 0;  --> Inicializando aqui, nunca vai somar, visto que no final pro inicio do while, sempre vai voltar a ser 0.
			
			total += contador;
			
			System.out.println(total);
			
			contador ++;
		}

	}

}
