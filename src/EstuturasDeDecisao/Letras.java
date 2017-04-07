package EstuturasDeDecisao;
import java.util.Scanner;
public class Letras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String letra;
        System.out.println("ALGUMA LETRA  ");
       letra = leitor.next();
       letra = letra.toUpperCase(); 
       
       switch (letra){
           
           case "A":
           case "E":
           case "i":
           case "O":
           case "U":
               System.out.println("VOLGAL" );
               break;
           default:
               System.out.println("CONSOANTE");
                   
               
       }
       
    }
}
