
package ProjetoJogo;
import java.util.Scanner;
public class Pi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String[] FraseUsuario = new String [100];// palavra usuario 1.
        String[] RespostaUsuario = new String [100];// rrespostas do usuario 2.
        
        
        tabuleiro ();
        String entrada = entradaDeDados();
        
            
    }   
    public static void tabuleiro (){
        System.out.println("\"Instrucoes: esse jogo e para ser jogado de duas pessoas do seguinte modo: a primeira pessoa");
        
        System.out.println("Bruna");
        
    }
    
    public static String entradaDeDados (){
        Scanner leitor = new Scanner (System.in);
        
        String palavra;
        System.out.println("Palavra  ");
        palavra = leitor.next();
        
        return palavra;
    }
}
