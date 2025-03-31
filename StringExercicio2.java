import java.util.Scanner;
public class Main
{
    public static int f_contagem (String palavra){
        int nvogais = 0;
        String minusculo = palavra.toLowerCase(); // Põe tudo em minúsculo
        for (int i = 0; i < minusculo.length(); i++){
            if (minusculo.charAt(i) == 'a' || minusculo.charAt(i) == 'e' || minusculo.charAt(i) == 'i' || minusculo.charAt(i) == 'o' || minusculo.charAt(i) == 'u'){
                nvogais = nvogais + 1; // Verifica letra por letra se cada letra é vogal ou não, se for, +1 em nvogais
            }
        }
        return nvogais;
    }    

	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		String palavra = scanner.nextLine();
		int nvogais = f_contagem(palavra);
		System.out.printf("A palavra %s contém %d vogais", palavra, nvogais);
		
		scanner.close();
	}
}
