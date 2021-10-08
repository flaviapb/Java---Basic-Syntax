package fluxosencadeados;

public class Testarlacos {
	
	public static void main(String[] args) {
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.printf("\nTabuada do %d\n",multiplicador);
			
			for (int contador = 1; contador <= 10; contador++) {
				
				System.out.printf("%d x %d = %d",multiplicador,contador,contador*multiplicador);
				System.out.println(" ");
			}
		}
	}
}