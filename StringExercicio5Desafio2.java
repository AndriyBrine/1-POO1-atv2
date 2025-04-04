import java.util.Scanner;
public class StringExercicio5Desafio2 {

	public static void f_separar (String frase) {
		int tamanho = frase.length();
		char letra;
		String palavra = "";
		String maiorp = "";
		String menorp = "";

		int contador = 0;

		for (int i = 0; i < tamanho; i++) {
			if (frase.charAt(i) != ' ') {
				palavra = palavra + frase.charAt(i);
			}
			else if (palavra.length() >= 4) {
				System.out.println(palavra);

				if ((menorp.equals("")) || (palavra.length() < menorp.length())) {
					menorp = palavra;
				}
				if (palavra.length() > maiorp.length()) {
					maiorp = palavra;
				}
		    	palavra = "";

			}

		}
		System.out.printf("MENOR PALAVRA ENCONTRADA: %s", menorp);
		System.out.println("");
		System.out.printf("MAIOR PALAVRA ENCONTRADA: %s", maiorp, "\n");

	}

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		System.out.println("PALAVRAS ENCONTRADAS");
		System.out.println("====================");
		f_separar(frase);
		scanner.close();
	}

}










V2 PRA CONSERTAR











	import java.util.Scanner;
public class Main {

	public static void f_separar (String frase) {
		int tamanho = frase.length();
		char letra;
		String palavra = "";
		String maiorp = "";
		String menorp = "";

		int contador = 0;

		for (int i = 0; i < tamanho; i++) {
			if (frase.charAt(i) != ' ') {
				palavra = palavra + frase.charAt(i);
			}
			else {
			    if (palavra.length() >= 4) {
				System.out.println(palavra);

				if ((menorp.equals("")) || (palavra.length() < menorp.length())) {
					menorp = palavra;
				}
				if (palavra.length() > maiorp.length()) {
					maiorp = palavra;
				}
		    	palavra = "";

			    }
		    }

            if (palavra.length() >= 4) {
				System.out.println(palavra);

				if ((menorp.equals("")) || (palavra.length() < menorp.length())) {
					menorp = palavra;
				}
				if (palavra.length() > maiorp.length()) {
					maiorp = palavra;
				}
			}
		}
		System.out.printf("MENOR PALAVRA ENCONTRADA: %s", menorp);
		System.out.println("");
		System.out.printf("MAIOR PALAVRA ENCONTRADA: %s", maiorp, "\n");

	}

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		String frase = scanner.nextLine();
		System.out.println("PALAVRAS ENCONTRADAS");
		System.out.println("====================");
		f_separar(frase);
		scanner.close();
	}

}
