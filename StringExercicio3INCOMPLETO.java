import java.util.Scanner;
public class StringExercicio3
{
    public static void f_AsteriscoA (String a){
        String ast = " ";
        int altura = 10;
        
        for (int i = 0; i <= altura; i++){
            for (int j = 0; j < i; j++){
                ast = ast + "*";
            }
            ast = ast + "\n";
        }
        System.out.print(ast);
    }    
    
    public static void f_AsteriscoB (String b){
        String ast = "**********";
        int altura = ast.length();
        
        for (int i = altura; i >= 1; i--){
            String vazio = "";
            for (int j = 0; j < i; j++){
                vazio = vazio.concat(String.valueOf(ast.charAt(j))); // Vazio = vazio (" ") junto com um numero i de asteriscos. 
            }
            System.out.println(vazio);
        }
    }  
   // EM PRODUÇÃO 
    public static void f_AsteriscoC (String c){
        String ast = "**********";
        int altura = 10;
        
        for (int i = 0; i < altura; i++){
            String vazio = "";
            for (int j = 0; j < i; j++){
                ast = vazio + ast;
                
            }
        }
        System.out.println(ast);
    }            

	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    System.out.println("Digite a letra que representa o padrão que você quer ver");
		String letra = scanner.nextLine();
		if (letra.equals("a")){
		    f_AsteriscoA(letra);
		} else if (letra.equals("b")){
		    f_AsteriscoB(letra);
		} else if (letra.equals("c")){
		    f_AsteriscoC(letra);
		}

		
		scanner.close();
	}
}
