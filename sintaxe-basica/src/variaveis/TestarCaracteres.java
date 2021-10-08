package variaveis;

public class TestarCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		/*char letras = "AB"; -> Não funciona, só podemos armazenar uma única letra.
		System.out.println(letras); */
		
		// --> Char é um tipo númerico de 16 bits, então:
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char)(valor + 1);
		System.out.println(valor);
		
		// --> O resultado está sendo uma letra, pois o char se baseia na tabela do unicode.
		
		// --> Sempre que for char trabalhamos com aspas simples, já com String com aspas duplas.
		
		String frase = "Eu tenho que estudar Java esse final de dia!";
		System.out.println(frase);
		
		// --> Outra curiosidade é que não dá pra deixar o char vazio, diferente da String, só podemos deixar o char com espaço, vemos:
		
				//char vazioChar = ' ';
				//String vazioString = "";
		

	}
}