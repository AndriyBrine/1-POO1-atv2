import java.util.Scanner;
public class StringExercicio1{

	public static String f_semespaco (String palavra){
		String palSE = "";
		for (int i = 0; i < palavra.length(); i++){
			if (!(palavra.charAt(i) == ' ')){
				palSE = palSE + palavra.charAt(i);
			}
		}
		return palSE;
	}

	public static String f_inverte(String palSE){ 
		String palINVerte = "";
		for (int i = palSE.length()-1; i >= 0; i--){
			palINVerte = palINVerte + palSE.charAt(i);
		}
		return palINVerte;
	}
		


	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		String palavra = scanner.nextLine();
		String palSE = f_semespaco(palavra);
		String palINVerte = f_inverte(palSE);

		if (palSE.equals(palINVerte)){
			System.out.println(palSE + " É palidromo!!");
		} else {
			System.out.println(palSE + " Não é palindromo!!");
		}


	}

}