package secoes;

public class Aula07_58_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String maiusculas = original.toUpperCase();
		System.out.println("01 " + maiusculas);
		
		String minusculas = original.toLowerCase();
		System.out.println("02 " + minusculas);
		
		String eliminarEspacos = original.trim();
		System.out.println("03 " + eliminarEspacos); // inicio e no fim
		
		String eliminarCaracterPosicao = original.substring(2);
		System.out.println("04 " + eliminarCaracterPosicao);
		
		String recortarTexto = original.substring(2, 9);
		System.out.println("05 " + recortarTexto);
		
		String substituirCaractere = original.replace('a', 'x');
		System.out.println("06 " + substituirCaractere);
		
		String substituirPalavra = original.replace("abcde", "xyzuk");
		System.out.println("07 " + substituirPalavra);
		
		int primeiraOcorrencia = original.indexOf("bc");
		System.out.println(primeiraOcorrencia);
		
		int ultimaOcorrencia = original.lastIndexOf("bc");
		System.out.println(ultimaOcorrencia);
		
		String produtos = "Reinaldo Hernan Baeza";
		String[] vect = produtos.split(" ");
		
		System.out.println(vect[0]);
	
 	}

}
