package EstruturasSequencias;

import java.util.Scanner;
import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random rng = new Random();
        
        int i;
        
        i = rng.nextInt(10);
        i = i + 20;
        
        System.out.println("sorteio  " + i);
        

    }

}
