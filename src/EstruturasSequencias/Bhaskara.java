package EstruturasSequencias;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double x1, x2, a, c, prod, somaX ;

        System.out.println(" primeiro valor: ");
        x1 = leitor.nextDouble();

        System.out.println("segundo valor: ");
        x2 = leitor.nextDouble();

        System.out.println("valor de C: ");
        c = leitor.nextDouble();

        somaX = x1 + x2;
        prod = x1 * x2;
        a = c / prod;
        
        
        System.out.println("Resultado é:  " + a);
        
    
            

    }
}
