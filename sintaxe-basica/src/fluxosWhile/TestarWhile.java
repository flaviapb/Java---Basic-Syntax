package fluxosWhile;

public class TestarWhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 10) {
			
			System.out.println(contador);
			// Formas de implementar o contador 
			
			//contador = contador + 1; 
			//contador += 1; 
			contador++;
			//++contador;
		}
	}
}