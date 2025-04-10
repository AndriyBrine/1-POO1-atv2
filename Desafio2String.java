import java.util.Scanner;

public class StringExercicio5Desafio2 {

    public static void f_separar(String frase) {
        int tamanho = frase.length();
        String palavra = "";
        String maiorp = "";
        String menorp = "";

        for (int i = 0; i < tamanho; i++) {
            char letra = frase.charAt(i);

            if (letra != ' ') {
                palavra += letra;
            } else {
                if (palavra.length() >= 4) {
                    System.out.println(palavra);

                    if (menorp.equals("") || palavra.length() < menorp.length()) {
                        menorp = palavra;
                    }
                    if (palavra.length() > maiorp.length()) {
                        maiorp = palavra;
                    }
                }
                palavra = "";
            }
        }

        // Processa a última palavra (se não terminar com espaço)
        if (palavra.length() >= 4) {
            System.out.println(palavra);

            if (menorp.equals("") || palavra.length() < menorp.length()) {
                menorp = palavra;
            }
            if (palavra.length() > maiorp.length()) {
                maiorp = palavra;
            }
        }

        System.out.printf("MENOR PALAVRA ENCONTRADA: %s\n", menorp);
        System.out.printf("MAIOR PALAVRA ENCONTRADA: %s\n", maiorp);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        System.out.println("PALAVRAS ENCONTRADAS");
        System.out.println("====================");
        f_separar(frase);
        scanner.close();
    }
}
