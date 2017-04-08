package EstuturasDeDecisao;

import java.util.Scanner;
import java.util.Random;

public class Adivinha {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random rng = new Random();

        int a, b;
        boolean acertou = false;

        System.out.println("seu numero:");
        a = leitor.nextInt();
        
        b = rng.nextInt(10);
        b = b + 1;
        System.out.println("SEU NUMERO FOI: " + a + "  NUMERO SORTEADO: " +b);
        
        if ( b == a ){
            acertou = true;
            System.out.println("  ACERTOU  ");
        }else{
            acertou = false;
            System.out.println( " ERROU  ");
        }
    }

}
