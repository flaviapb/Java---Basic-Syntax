package variaveis;

public class TestarCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		/*char letras = "AB"; -> N�o funciona, s� podemos armazenar uma �nica letra.
		System.out.println(letras); */
		
		// --> Char � um tipo n�merico de 16 bits, ent�o:
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char)(valor + 1);
		System.out.println(valor);
		
		// --> O resultado est� sendo uma letra, pois o char se baseia na tabela do unicode.
		
		// --> Sempre que for char trabalhamos com aspas simples, j� com String com aspas duplas.
		
		String frase = "Eu tenho que estudar Java esse final de dia!";
		System.out.println(frase);
		
		// --> Outra curiosidade � que n�o d� pra deixar o char vazio, diferente da String, s� podemos deixar o char com espa�o, vemos:
		
				//char vazioChar = ' ';
				//String vazioString = "";
		

	}
}