import java.util.Scanner;
public class StringExercicio4
{
    
    public static void f_LosangoALF (int tamanho){
        int metade = tamanho/2;
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int altura = 10;
        
        // Primeira metade
        for (int i = 0; i <= metade; i++){ // Vai criar espaços vazio etc até metade do tamanho losango (a outra metade naão precisa)
            for (int j = 0; j < metade - i; j++){ // Vai criar espaços vazios até a metade - 1 do tamanho do losango
                System.out.print(" ");
            }
            System.out.println(alfabeto.substring(0, 2*i+1)); // Finalmente, coloca as letra (de 0 até i). O +1 serve para sempre manter ímpar. Por exemplo, quando i é 2, vai por 5 letras (ABCDE) e não 4.
        }
        
        // Segunda metade
        for (int i = metade; i >= 0; i--){ // Agora é o inverso da anterior, começa com metade do tamanho e vai criar espaços vazios até 1 letra.
            for (int j = 0; j <= metade - i; j++){ // Cria espaços vazios igual a anterior, mas como o i agora é maior, vai criar menos espaços vazios inicialmente
                System.out.print(" ");
            }
            System.out.println(alfabeto.substring(0, i*2-1)); // Finalmente, coloca as letra (de 0 até i). O +1 serve para sempre manter ímpar. Por exemplo, quando i é 2, vai por 5 letras (ABCDE) e não 4. Faz isso inversamente.
        }
    }   
    

	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int tamanho = scanner.nextInt();
	    while (tamanho >= 26){
	        System.out.println("Digite novamente "); // O máximo é 25, porque a metade vai ser 13 (limite para as letras do alfabeto).
	        tamanho = scanner.nextInt();
	    }
		f_LosangoALF(tamanho);
		
		
		scanner.close();
	}
}

// TAMANHO IDEAL PARA GERAR A IMAGEM PEDIDA: 11
